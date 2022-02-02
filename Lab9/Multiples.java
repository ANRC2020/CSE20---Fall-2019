import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program prints out multiples of a given number till a specified maximum.");
		System.out.print("Please enter the max number: ");
		int max = input.nextInt();
		System.out.print("Please enter the number whose multiples to print: ");
		int multiple = input.nextInt();
		System.out.println("Multiples of " + multiple + " from 1 till " + max + " are: ");
		
		int i = 1;
		
		while ( i  <= max) {
			if(i % multiple == 0) {
				System.out.println("Number " + i );	
			}
			i++;
		}
	}
}