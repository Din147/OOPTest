package Test3;

public class Table extends Furniture {

	
	private int legs; 
	private String shape; 
	private int depth;
	
	public Table(int height, int width,int legs,int depth,String shape) throws Exception {
		super(height, width);
		
		
		this.legs=legs;
		if (this.legs<3) {
			throw new Exception("legs must be higer than 2");
		}
		this.shape=shape;
		
		if (!this.shape.equals("circle") && !this.shape.equals("square") && !this.shape.equals("rectangle")) {
			throw new Exception("must be valid shape");
		}
		this.depth=depth;
		if (this.depth<30) {
			throw new Exception("depth must be higer than 29");
		}

		
	}

}
