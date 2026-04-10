package shapes;

public class sphere extends shape3d {

	private double radius;
	public sphere(double radius) {
		this.radius = radius;
	}
	@Override
	public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
	
}
