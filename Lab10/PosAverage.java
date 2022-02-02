import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double total = 0;
		int counter = 1;
		int number = 0;
		
		System.out.println("Enter 0 or less to stop entering numbers.");
		
		do {
			System.out.print("Enter value #" + counter + ":");
			number = input.nextInt();
			if(number > 0) {
				total += number;
				counter++;
			} else {
				counter --;
				if(counter == 0) {
					System.out.println("No positive numbers were input.");	
					break;
				} else {
					System.out.println("Average is " + (total / counter) );	
					break;					
				}
			}
		} while ( 0 <= number); 
	} 
}