package practice;
import java.util.Scanner;
public class fourth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int D = b*b - 4*a*c;
		if(D<0) {
			System.out.println("invalid");
		}
		else System.out.println(D);
		scan.close();

	}

}
