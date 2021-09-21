package Test3;

public class Closet extends Furniture{
	private int depdth; 
	private int height; 
	private int width;

	public Closet(int height, int width,int depdth) throws Exception {
		super(height, width);
		this.depdth=depdth;
		this.height=height;
		this.width=width;
		if(this.depdth<10) {
			throw new Exception("depth Closet must be higher than 9"); 
			
		}
	}
@Override
public int getHeight() {
		return height;
	}
@Override
	public int getWidth() {
		return width;
	}

public int getDepdth() {
	return depdth;
}
}
