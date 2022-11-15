package finalProject_1410;

public class CarTestApp {

	public static void main(String[] args) {
		Car myCar = new Car(new Body(Frame.SPORTSCAR), new Engine(EngineBlock.VEngine), new Tires(TireType.ALL_TERRAIN));
		
		System.out.print(myCar.getCurrentSpeed());

	}

}
