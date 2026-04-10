package piza;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Cat cat = new Cat();
        Student student = new Student("Камшат");

        System.out.println("=== Serving Cat ===");
        restaurant.servePizza(cat);
     

        System.out.println("\n=== Serving Student ===");
        restaurant.servePizza(student);
       
    }
}