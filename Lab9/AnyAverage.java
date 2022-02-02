import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will find the average of as many numbers as you like.");
		System.out.print("Please choose the number of values to average: ");
		int num = input.nextInt();
		
		int i = 1;
		int total = 0;
				
		while ( i <= num ) {
			System.out.print("Please enter the " + i + " number: ");
			int input1 = input.nextInt();
			total += input1;
			i++;
		}
		
		System.out.println("The average of all the numbers is: " + (double)(total / num));
	}
}