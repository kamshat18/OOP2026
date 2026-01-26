package practice;
import java.util.Scanner;
public class sixth {
	static void myMethod(String s) {
		String rev = new StringBuilder(s).reverse().toString();
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Eto palindrom");		  
		}
		else {
			System.out.println("Eto ne palindrom");
		} 
	  }
	public static void main(String[] args) {
		System.out.println("Enter vaw string:"+" ");	
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		myMethod(s);
		scan.close();
	}

}
