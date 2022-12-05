package finalProject_1410;

import java.io.File;

public class CarTestApp {

	public static void main(String[] args) {
		Car myCar = new Car(new Body(Frame.OFFROAD), new Engine(EngineBlock.VEngine), new Tires(TireType.ALL_TERRAIN));
		
		System.out.println(myCar.getCurrentSpeed());
		
		//Car.saveCar(myCar, new File("SavedCars.txt"));
		System.out.println(Car.loadCar(new File("SavedCars.txt"), 2));

	}

}
