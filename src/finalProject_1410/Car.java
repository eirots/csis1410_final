package finalProject_1410;
public class Car {
	
	private double currentSpeed = 0;
	private Body body;
	private Engine engine;
	private Tires tires;
	
	public Car(Body body, Engine engine, Tires tires) {
		this.body = body;
		this.engine = engine;
		this.tires = tires;
	}

	public Car(Car car) {
		this.body = car.getBody();
		this.engine = car.getEngine();
		this.tires = car.getTires();
	}
	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public double calculateCurrentSpeed(double oldCurrentSpeed, String trackType) throws Exception {
		if(trackType == "Road") {
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

	public Body getBody() {
		return body;
	}

	public Engine getEngine() {
		return engine;
	}

	public Tires getTires() {
		return tires;
	}
	
	
	
	
	
	
	

}
