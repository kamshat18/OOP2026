package lab1_5pt;

import lab1_5pt.Student;
import lab1_5pt.Class;
import java.util.ArrayList;

public class GradeBook {

    private Class course;
    private ArrayList<Student> students;

    public GradeBook(Class course) {
        this.course = course;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
    }

    public double determineClassAverage() {
        int total = 0;

        for (Student s : students) {
            total += s.getGrade();
        }

        return (double) total / students.size();
    }

    public void displayGradeReport() {

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        Student highestStudent = null;
        Student lowestStudent = null;

        int[] frequency = new int[11];

        for (Student s : students) {

            int grade = s.getGrade();

            if (grade > highest) {
                highest = grade;
                highestStudent = s;
            }

            if (grade < lowest) {
                lowest = grade;
                lowestStudent = s;
            }

            frequency[grade / 10]++;
        }

        System.out.printf("Class average is %.2f\n", determineClassAverage());
        System.out.println("Lowest grade is " + lowest + " (" + lowestStudent + ")");
        System.out.println("Highest grade is " + highest + " (" + highestStudent + ")");

        outputBarChart(frequency);
    }

    public void outputBarChart(int[] frequency) {

        System.out.println("\nGrades distribution:");

        for (int i = 0; i < frequency.length; i++) {

            if (i == 10)
                System.out.print("100: ");
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int stars = 0; stars < frequency[i]; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook{course=" + course + ", students=" + students + "}";
    }
}
