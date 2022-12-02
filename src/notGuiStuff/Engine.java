package notGuiStuff;

public class Engine {
	private double acceleration;
	private double maxSpeed;
	EngineBlock engineBlock;

	public Engine(EngineBlock engineBlock) {
		this.engineBlock = engineBlock;
		
		switch (engineBlock) {
		case VEngine:
			acceleration=5;
			maxSpeed = 15;
			break;
			
		case InlineEngine:
			acceleration=3;
			maxSpeed = 18;
			
			break;
			
		case OpposedEngine:
			acceleration=7;
			maxSpeed=12;
			
			break;
			
		}
		
		
		
		//Vmax = ( 2 · P / (c · D · A) )1/3
		//P is power HP in watts
		//c is drag coefecient
		//A is area weidth times height
		//D is 1.25 KG/m^3
	}

	public double getAcceleration() {
		return acceleration;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public EngineBlock getEngineBlock() {
		return engineBlock;
	}

}
