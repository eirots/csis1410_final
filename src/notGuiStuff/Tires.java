package notGuiStuff;

public class Tires {

	private double offRoadSpeed;
	private double roadSpeed;
	TireType tires;
	
	
	public Tires(TireType tires) {
		this.tires = tires; 
		switch (tires) {
		
		case LOWPROFILE:
			offRoadSpeed=100.0;
			roadSpeed=-200.0;
			break;
		case ALL_TERRAIN:
			offRoadSpeed=150.0;
			roadSpeed=150.0;
			break;
			
		case OFFROAD:
			offRoadSpeed=200.0;
			roadSpeed=100.0;
			break;	
			
		default:
		offRoadSpeed=0;
		roadSpeed=0;
		break;
		}
	}


	public double getOffRoadSpeed() {
		return offRoadSpeed;
	}


	public double getRoadSpeed() {
		return roadSpeed;
	}


	public TireType getTiresType() {
		return tires;
	}

}
