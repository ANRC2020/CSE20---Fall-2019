import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.print("Please enter the first number: ");
		n1 = input.nextInt();

		System.out.print("Please enter the second number: ");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		System.out.println("The average of the numbers is " + average);
		//added "ln"

		//Scanner input = new Scanner(System.in); Don't need to re-initialize

		float n10, n20; // Can't have duplicate variables; changed them in the subsequent code too

		System.out.print("Please enter the first number:");
		n10 = input.nextFloat();

		System.out.print("Please enter the second number: ");
		n20 = input.nextFloat();

		float average1; // Can't have duplicate variables; changed them in the subsequent code too
		average1 = ((n10+n20)/2);
		System.out.println("The average of the numbers is " + average1);
		// added "ln"
		
		short s1, s2;

		System.out.print("Please enter the first number: ");
		s1 = input.nextShort();

		System.out.print("Please enter the second number: ");
		s2 = input.nextShort();

		short shortAvg;
		shortAvg = (short) ((short)(s1+s2)/2); // Change n1 and n2 to s1 and s2; resolve type error in this line by adding (short)
		System.out.println("The average of the numbers is " + shortAvg);
		//added "ln"
	}

}
