package finalProject_1410;

public class Body {
	
	private double weight;
	private String color;
	private double drag;
	Frame frame;
	
	public Body(Frame frame) {
		this.frame = frame; 
		switch (frame) {
		
		case SPORTSCAR:
			weight=2000;
			drag=-1;
			break;
		case OFFROAD:
			weight=4000;
			drag=-3;
			break;
		default:
		weight=1000;
		break;
		}
		
	
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
	
		return weight;
	}

	public double getDrag() {
		
		return drag;
	}

	public Frame getFrame() {
		return frame;
	}
	
	

}
