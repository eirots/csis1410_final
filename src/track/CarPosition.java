package track;

public class CarPosition {
	private int x;

	
	CarPosition(int x, int y){
		this.x = x;
	}
	
	public int getPositionX(){
		return this.x;
	}

	public void updatePositionX(int step) {
		this.x += step;
	}

	
}

