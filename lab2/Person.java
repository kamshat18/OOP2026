package pet_man_sys;
import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet = null;

    public Person(String name, int age) {
        this.name = name; this.age = age;
    }

    public abstract String getOccupation();

    // Переопределяется в PhDStudent для запрета Dog
    public void assignPet(Animal pet) { this.pet = pet; }
    public void removePet()            { this.pet = null; }
    public boolean hasPet()            { return pet != null; }
    public Animal getPet()             { return pet; }
    public String getName()            { return name; }

    // Уходим в отпуск — отдаём питомца другому
    public void leavePetWith(Person caretaker) {
        if (!hasPet()) {
            System.out.println(name + " has no pet to leave."); return;
        }
        if (caretaker.hasPet()) {
            System.out.println(caretaker.getName()
                + " already has a pet."); return;
        }
        caretaker.assignPet(pet); // assignPet может бросить исключение
        System.out.println(name + " left "
            + pet.getName() + " with " + caretaker.getName());
        removePet();
    }

    // Вернулись — забираем питомца обратно
    public void retrievePetFrom(Person caretaker) {
        if (!caretaker.hasPet()) {
            System.out.println(caretaker.getName()
                + " has no pet to return."); return;
        }
        assignPet(caretaker.getPet());
        caretaker.removePet();
        System.out.println(name + " retrieved pet from "
            + caretaker.getName());
    }

    @Override
    public String toString() {
        return getOccupation() + " " + name
            + (hasPet() ? " [pet: "+pet.getName()+"]" : " [no pet]");
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (!(o instanceof Person)) return false;
        return Objects.equals(name, ((Person)o).name)
            && age == ((Person)o).age;
    }

    @Override
    public int hashCode() { return Objects.hash(name, age); }
}