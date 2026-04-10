package pet_man_sys;

import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person p)    { people.add(p); }
    public void removePerson(Person p) { people.remove(p); }

    public ArrayList<Person> withPets() {
        ArrayList<Person> res = new ArrayList<>();
        for (Person p : people) if (p.hasPet()) res.add(p);
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--- Registry ---\n");
        for (Person p : people) sb.append(p).append("\n");
        return sb.toString();
    }
}

