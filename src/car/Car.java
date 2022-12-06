package car;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The main class for a car to be created and for other classes to have functionality
 * @author Spencer
 *
 */
public class Car {
	
	private double currentSpeed = 0;
	private Body body;
	private Engine engine;
	private Tires tires;
	
	/**
	 * Creates a Car based off of provided values.
	 * @param body. The Body of the car, created by Frame.Enum
	 * @param engine The Engine of the car, created by EngineBlock.Enum
	 * @param tires The Tires of the car, created by TireType.Enum
	 */
	public Car(Body body, Engine engine, Tires tires) {
		this.body = body;
		this.engine = engine;
		this.tires = tires;
	}

	/**
	 * Creates a Car based off another Car
	 * @param car
	 */
	public Car(Car car) {
		this.body = car.getBody();
		this.engine = car.getEngine();
		this.tires = car.getTires();
	}
	/**
	 * Finds, sets, and returns the speed of the car
	 * Acceleration * Tire Multiplier + Speed.    * drag/weight
	 * @param oldCurrentSpeed Double. The Current speed of the care before updating it.
	 * @param trackType String. The Type of Track the car is traveling on.
	 * Technically we could change the track Type throughout the race but that might be a bit ambitious for the scope of this project.
	 * @return Double. The new speed of the Car.
	 * @throws Exception. Checks to see if an invalid track type was passed to the equation.
	 */
	public double calculateCurrentSpeed(double oldCurrentSpeed, String trackType) throws Exception {
		if(trackType == "OnRoad") {
			currentSpeed =(((engine.getAcceleration() * tires.getRoadSpeed()) + currentSpeed) * body.getDrag())/ body.getWeight();
		}
		
		else if(trackType == "OffRoad") {
			currentSpeed =(((engine.getAcceleration() * tires.getOffRoadSpeed()) + currentSpeed) * body.getDrag())/ body.getWeight();
		}
		else {
			throw new Exception("Invalid Track Type, returning 0.0");
		}
		if(currentSpeed >= engine.getMaxSpeed()) {
			currentSpeed = engine.getMaxSpeed();
		}
		return currentSpeed;		
	}

	/**
	 * Returns the speed of the Car however the method calculateCurrentSpeed should be used to update the speed
	 * @return double. Speed of the Car
	 */
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	/**
	 * 
	 * @return Body. The body of the Car
	 */
	public Body getBody() {
		return new Body(body.getFrame());
	}

	/**
	 * 
	 * @return Engine. The Engine of the Car
	 */
	public Engine getEngine() {
		return new Engine(engine.getEngineBlock());
	}

	/**
	 * 
	 * @return Tires. The tires of the car
	 */
	public Tires getTires() {
		return new Tires(tires.getTiresType());
	}
	

	/**
	 * Appends a passed car to a file in the following format
	 * {Frame},{EngineBlock},{TireType}
	 * @param carToSave the Car object you wish to save
	 * @param file to save the Car Object line to
	 */
	public static void saveCar(Car carToSave, File file) {
		try(PrintWriter writer = new PrintWriter(new FileOutputStream(file, true))){
			String formattedString = String.format("%s,%s,%s",carToSave.getBody().getFrame(),carToSave.getEngine().getEngineBlock(),carToSave.getTires().getTiresType());
			writer.println(formattedString);
		}catch(FileNotFoundException e) {
			System.err.println(e + "was not found");
		}catch(Exception e) {
			
			System.err.println("An Error Occured " + e.getStackTrace());
		}
	}
	/**
	 * Loads a car from a txt file. Cars should have following format when being saved
	 * {Frame},{EngineBlock},{TireType}
	 * note this creates a new Car Object
	 * @param file to read from
	 * @param lineNumber starts on line 1. Will skip to the specified line, IE the car you want is on line 2 you pass 2 as the second parameter and it will skip to and read from that line
	 * @return
	 */
	public static Car loadCar(File file, int lineNumber) {
		try(Scanner reader = new Scanner(file)) {
			  for(int i = 1; i < lineNumber;i++){
		           if(reader.hasNextLine())reader.nextLine();
		      }
			  String line = reader.nextLine();
			  String[] splitLine = line.split(",");
			  return new Car(new Body(Frame.valueOf(splitLine[0])), new Engine(EngineBlock.valueOf(splitLine[1])),new Tires(TireType.valueOf(splitLine[2])));
			  
		}catch(Exception e){
			System.err.println("An Error Occured " + e.getStackTrace());
		}
		return null;
	}

	@Override
	public String toString() {
		return "Car [currentSpeed=" + currentSpeed + ", frame=" + body.getFrame() + ", engine=" + engine.getEngineBlock() + ", tires=" + tires.getTiresType() + "]";
	}
	


}
