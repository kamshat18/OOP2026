package shapes;

public class cube extends shape3d {
	private double side;
	public cube(double side) {
		this.side = side;
	}
	@Override
	public double volume() {
		return side*side*side;
	}
	 @Override
	    public double surfaceArea(){ 
		 return 6 * side * side; 
	 }
}
