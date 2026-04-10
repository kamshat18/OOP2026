package part_C;
import java.util.HashSet;

public class TestPerson {

    public static void main(String[] args) {

        HashSet<Person> set = new HashSet<>();

        set.add(new employee("Lola",20,"1"));
        set.add(new employee("Alikosh",20,"1"));
        set.add(new employee("Safi" , 1 , "2"));

        System.out.println(set.size());
    }
}