package lab3_5pt;

//INTERFACE
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane is flying");
    }
}
//ABSTRACT
abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    abstract void makeSound();
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Woof");
    }
}