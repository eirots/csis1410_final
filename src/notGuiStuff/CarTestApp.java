package notGuiStuff;

import car.Body;
import car.Car;
import car.Engine;
import car.EngineBlock;
import car.Frame;
import car.TireType;
import car.Tires;

public class CarTestApp {

	public static void main(String[] args) {
		Car myCar = new Car(new Body(Frame.SPORTSCAR), new Engine(EngineBlock.VEngine), new Tires(TireType.ALL_TERRAIN));
		
		System.out.print(myCar.getCurrentSpeed());

	}

}