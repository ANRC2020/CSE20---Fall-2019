import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will find the average of any set of numbers.");
		System.out.print("Please choose number of values to average: ");
		int max = input.nextInt();
		System.out.print("Please choose column width for output formatting: ");
		int width = input.nextInt();
		int total = 0;
		
		int[] arr1 = new int[max + 1];
		
		int i = 1;

		for (i = 1; i <= max; i++) {
			System.out.print("Please enter value #" + i + ":");
			int input1 = input.nextInt();
			arr1[i] += input1;
		}
		
		System.out.println("The numbers being averaged are ...");
		for(i = 1; i <= max; i++) {
			if(i % width != 0) {
				System.out.print(arr1[i] + " ");
				total += arr1[i];
			} else {
				System.out.println(arr1[i] + " ");
				total += arr1[i];
			}
		}
		
		System.out.println("");
		
		System.out.println("Average is: " + ((double)total / max));
		input.close();
	}
}