package practice;
import java.util.Scanner;

public class Tr {
	public static void main(String[]args) {
		System.out.println("Hello world");
		Scanner scan = new Scanner(System.in);
		System.out.print("ur name:"+" ");
		String s = scan.nextLine();
		scan.close();
		System.out.println("+---+");
		System.out.println("|"+s+"|");
		System.out.println("+---+");
		
	}
}
