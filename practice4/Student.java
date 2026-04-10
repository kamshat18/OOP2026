package piza;

public class Student extends Person implements
CanHavePizza, CanHaveRetake, Movable  {

	public Student(String name) {
		super(name);
	}
	@Override
	public void eatPizza() {
		 System.out.println("Student is eating pizza!");	
	}
	@Override
	public void retakeExam() {
        System.out.println("Its retake, sorry");
    }

    @Override
    public void move() {
        System.out.println("Student is moving!");
    }

}
