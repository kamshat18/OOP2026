package shapes;

public class cylinder extends shape3d{

	private double radius, height;
	public cylinder(double r, double h) {
	this.radius = r;
	this.height = h;
	}
	@Override
	public double volume() {
	return Math.PI * radius * radius * height;
	}
	@Override
	public double surfaceArea() {
		 return 2 * Math.PI * radius * (radius + height);
		}


}
