import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");
		int max = input.nextInt();
		int total = 0;
		for (int i = 1; i <= max; i++) {
		System.out.println("Number " + i);
		total += i;
		}
		System.out.println("The sum of all numbers from 0 till " + max + " is: " + total);
	}
}