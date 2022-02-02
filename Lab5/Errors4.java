import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {

		int n1, n2;

		Scanner kbd = new Scanner(System.in);
		//initialized scanner
		System.out.println("This program asks the user for two integers and calculates their sum as an integer.");

		// removed "kbd = new Scanner(System.in);"

		System.out.print("Enter the first number: ");
		n1 = kbd.nextInt();
		// moved n1 statement after the prompt
		
		System.out.print("Enter the second number: ");
		n2 = kbd.nextShort();

		System.out.println("The sum of the numbers is " + (n1+n2));
		// removed the "(float)" type switch in front of the addition 
	}

}