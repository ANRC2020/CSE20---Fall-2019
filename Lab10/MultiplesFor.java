import java.util.Scanner;

public class MultiplesFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");
		int max = input.nextInt();
		System.out.print("Please enter the divisor: ");
		int num = input.nextInt();
		
		for (int i = 1; i <= max; i++) {
			if(i % num == 0) {
				System.out.println("Number " + i);
		}
		}
	}
}