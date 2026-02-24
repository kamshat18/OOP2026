package lab1_5pt;
import java.util.Scanner;

public class Analyzer{

	public static void main(String[] args) {
		Scanner scan =  new Scanner (System.in);
		Data datA = new Data();
		while(true) {
			System.out.print("Enter number (Q to quit): ");
			String input = scan.next();
			if(input.equalsIgnoreCase("Q")) {
				break;
			}
			try {
				Double value = Double.parseDouble(input);
				datA.add(value);
			}
			catch(NumberFormatException x){
				System.out.println("Invalid input! Please enter a number or 'Q'.");
				
			}
			
		}
		System.out.println("Avg = " + datA.getAvg());
		System.out.println("Max = "  + datA.getMax());
		scan.close();
		
	}
	
}