package lab1_5pt;

import java.util.Vector;
import java.util.Scanner;

enum Gender {
    BOY, GIRL
}

class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return (gender == Gender.BOY ? "B" : "G");
    }
}

public class DragonLaunch {
    private Vector<Person> victims = new Vector<>();

    public void kidnap(Person p) {
        victims.add(p);
    }

    public boolean willDragonEatOrNot() {
        int balance = 0;
        for (Person p : victims) {
            if (p.getGender() == Gender.BOY) {
                balance++;
            } else {
                if (balance > 0) {
                    balance--;
                } else {
                    return true;
                }
            }
        }
        return balance != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DragonLaunch launch = new DragonLaunch();

        System.out.println("Enter gender sequence (e.g., BBGG):");
        String input = sc.nextLine().toUpperCase();

        for (char c : input.toCharArray()) {
            if (c == 'B') {
                launch.kidnap(new Person(Gender.BOY));
            } else if (c == 'G') {
                launch.kidnap(new Person(Gender.GIRL));
            }
        }

        if (launch.willDragonEatOrNot()) {
            System.out.println("Result: Dragon will have a lunch!");
        } else {
            System.out.println("Result: No lunch for dragon.");
        }
        
        sc.close();
    }
}