package pet_man_sys;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name; this.age = age;
    }

    public abstract String getSound();

    public String getName() { return name; }
    public int    getAge()  { return age; }

    @Override
    public String toString() {
        return getClass().getSimpleName()
            + "(" + name + ", age=" + age + ") says: " + getSound();
    }
}

	
	
	
	
	