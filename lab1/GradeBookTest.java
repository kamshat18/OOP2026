package lab1_5pt;

import lab1_5pt.Student;
import lab1_5pt.Class;
import lab1_5pt.GradeBook;

import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Class course = new Class(
                "CS101",
                "Object-Oriented Programming and Design",
                5,
                "None"
        );

        GradeBook gradeBook = new GradeBook(course);

        gradeBook.displayMessage();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student id: ");
            int id = scanner.nextInt();

            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(name, id);
            student.setGrade(grade);

            gradeBook.addStudent(student);
        }

        gradeBook.displayGradeReport();

        scanner.close();
    }
}
