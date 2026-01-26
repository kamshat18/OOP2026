package practice;
import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter vaw balance: ");
        int a = scan.nextInt();
        System.out.println("va2 balance is = " + a);
        scan.nextLine(); 
        System.out.print("Do you want to save akwa? (yes/no): ");
        String ans = scan.nextLine();
        if(ans.equalsIgnoreCase("yes")) {
            System.out.print("Enter vaw akwa: ");
        	 int b = scan.nextInt();
             System.out.println("va2 balance is = " + (a+b)); 
             scan.nextLine();  
             }
        else if (ans.equalsIgnoreCase("no")) {
        	System.out.print("Okay no need");
        }
        scan.close();
    }
}
