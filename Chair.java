package Test3;

public class Chair extends Furniture {
	private int legs;

	public Chair(int height, int width, int legs) throws Exception {
		super(height, width);
		this.legs = legs;
		if (this.legs < 3) {
			throw new Exception("Chair's legs must be higer than 2");
		}

	}

	public int getLegs() {
		return legs;
	}

}
