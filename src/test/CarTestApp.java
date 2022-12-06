package test;

import car.Body;
import car.Car;
import car.Engine;
import car.EngineBlock;
import car.Frame;
import car.TireType;
import car.Tires;

import java.io.File;

public class CarTestApp {
	//commenting out test method because IDE is freaking out about having two mains. 
/*
	public static void main(String[] args) {
		Car myCar = new Car(new Body(Frame.OFFROAD), new Engine(EngineBlock.VEngine), new Tires(TireType.ALL_TERRAIN));
		
		System.out.println(myCar.getCurrentSpeed());
		
		//Car.saveCar(myCar, new File("SavedCars.txt"));
		System.out.println(Car.loadCar(new File("SavedCars.txt"), 2));

	}
	*/

}
