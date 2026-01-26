package practice;
import java.util.Scanner;
public class second {
	public static void main (String[]args) {
		System.out.println("your a:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("perimetr:"+4*a);
		System.out.println("dioganal:"+Math.round(Math.sqrt(2))*a);
		System.out.println("area:"+ Math.pow(a, 2));
		scan.close();
	}
	

}

