import java.util.Scanner;

public class ChooseFunc {

	public static void main(String[] args) {

		System.out.println("This program supports 4 functions of a max number:");
		System.out.println("\t1. SumAll");
		System.out.println("\t2. SumSquare");
		System.out.println("\t3. Factorial");
		System.out.println("\t4. Fibonacci");

		Scanner input = new Scanner(System.in);
		int func, max, i;
		long [] resArr;

		while (true) {
			System.out.print("Please choose the function you want: ");
			func = input.nextInt();

			System.out.print("Please enter the max number (> 0): ");
			max = input.nextInt();
			resArr = new long [max+1];

			for (i = 1; i <= max; i++) {
				if (func == 1) {
					resArr[i] = resArr[i-1] + i;
				} else if (func == 2) {
					resArr[i] = i * i;
				} else if (func == 3) {
					resArr[i] = resArr[i-1] * i;
				} else if (func == 4) {
					resArr[i] = resArr[i-1] + resArr[i - 2];
				} else {
					System.out.println("Error: " + func + " is an invalid choice for function.");
					break;
				}
			}

			System.out.print("Do you wish to repeat your inputs? (1 for yes): ");
			if (input.nextInt() == 1) {
				continue;
			}
			
			System.out.print("Do you wish to print the results? (1 for yes): ");
			if (input.nextInt() == 1) {
				System.out.println("Results in the array:");
				System.out.println("\tIndex\tValue");
				for (i = 0; i <= max; i++) {
					System.out.println("\t" + i +"\t"+ resArr[i]);
				}
					
			}

			System.out.print("Do you wish to quit the program? (1 for yes): ");
			if (input.nextInt() == 1) {
				break;
			}
		}
	}
}