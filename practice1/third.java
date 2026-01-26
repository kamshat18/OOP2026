
package practice;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("your point:");
        int a = scan.nextInt();

        String grade =
                a >= 95 ? "A" :
                a >= 90 ? "A-" :
                a >= 85 ? "B+" :
                a >= 80 ? "B" :
                a >= 75 ? "B-" :
                a >= 70 ? "C+" :
                a >= 65 ? "C" :
                a >= 60 ? "C-" :
                a >= 55 ? "D+" :
                a >= 50 ? "D" :
                a >= 25 ? "FX" :
                a >= 0  ? "F" :
                "Invalid score";

        System.out.println("your grade is " + grade);
        scan.close();
    }
}

