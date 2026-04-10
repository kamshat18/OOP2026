package task_5;

import task_4.*;
import java.util.Date;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Chocolate[] chocolates = {
            new Chocolate(50, "Twix"),
            new Chocolate(30, "Mars"),
            new Chocolate(70, "Snickers")
        };
        Sort.bubbleSort(chocolates);
        System.out.println(Arrays.toString(chocolates));

        Employee e1 = new Employee(
            "Alice",
            3000,
            new Date(),
            "123"
        );

        Employee e2 = new Employee(
            "Bob",
            2000,
            new Date(),
            "456"
        );

        Employee[] employees = {e1, e2};

        Sort.bubbleSort(employees);

        System.out.println(Arrays.toString(employees));
    }
}