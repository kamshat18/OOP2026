package lab3_5pt;

public interface Moveable {
	 void move();
}
class Car implements Moveable{
	 public void move() {
		 System.out.println("Car is moving");
	 };
}

class Bird2 implements Flyable {

    public void move() {
        System.out.println("Bird is moving");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}