import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will find the sum of all numbers till a specified maximum.");
		System.out.print("Please enter the max amount of numbers to add: ");
		int max = input.nextInt();
		
		int i = 0;
		int total = 0;
		
		while ( i <= max ) {
			System.out.println("Number " + i);
			total += i;
			i++;
		}
		
		System.out.println("The sum of all numbers from 0 till " + max + " is: " + total);
	}
}