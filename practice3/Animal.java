package practice3;

public class Animal {
	String breed = "Some breed";
	int numOfLegs = 4;
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
	void eat() {
		System.out.println("Animal Eats");
	}
	void sleep() {
		System.out.println("Animal sleeps ZzzZz");
	}
	void eat(String food) {
		 System.out.println("Animal eats " + food);
	}
}
class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Gav Gav");
	}
	@Override
	void eat() {
		System.out.println("Doggie Eats Bones");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();

	}
}

