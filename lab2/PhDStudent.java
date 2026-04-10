package pet_man_sys;

public class PhDStudent extends Person {
    private String researchTopic;
    public PhDStudent(String name, int age, String major, String topic) {
        super(name, age); this.researchTopic = topic;
    }


@Override
public void assignPet(Animal pet) {
    if (pet instanceof Dog) {
        System.out.println(
            getName() + " (PhD) can't have a Dog!");
        return;
    }
    super.assignPet(pet);
}

@Override public String getOccupation() {
    return "PhD(" + researchTopic + ")";
}}