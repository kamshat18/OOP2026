package task_4;

import java.util.Date;
import java.util.Arrays;
import java.util.Comparator;

public class test{

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Employee e1 = new Employee(
                "Alice",
                3000,
                new Date(),
                "111"
        );

        Employee e2 = new Employee(
                "Bob",
                2000,
                new Date(),
                "222"
        );

    
        System.out.println("Employees:");
        System.out.println(e1);
        System.out.println(e2);

        System.out.println();

        System.out.println("Equals check:");
        System.out.println(e1.equals(e2));

        System.out.println();

      
        System.out.println("Compare salaries:");
        System.out.println(e1.compareTo(e2));

        System.out.println();

        Manager m1 = new Manager(
                "John",
                4000,
                new Date(),
                "333",
                500
        );

       
        m1.addEmployee(e1);
        m1.addEmployee(e2);

   
        System.out.println("Manager:");
        System.out.println(m1);

        System.out.println();

        Manager clonedManager =
                (Manager) m1.clone();

        System.out.println("Cloned manager:");
        System.out.println(clonedManager);

        System.out.println();

     
        Employee[] employees = {e1, e2};

        Arrays.sort(employees);

        System.out.println("Sorted by salary:");
        System.out.println(
                Arrays.toString(employees)
        );

        System.out.println();

        Comparator<Employee> nameComp =
                new NameComparator();

        Arrays.sort(employees, nameComp);

        System.out.println("Sorted by name:");
        System.out.println(
                Arrays.toString(employees)
        );

        System.out.println();

        Comparator<Employee> dateComp =
                new HireDateComparator();

        Arrays.sort(employees, dateComp);

        System.out.println("Sorted by hire date:");
        System.out.println(
                Arrays.toString(employees)
        );

    }
}