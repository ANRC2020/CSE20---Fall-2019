import java.util.Scanner;

public class Errors3 {
// added {
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		//Scanner kbd = new Scanner System.in; Added ()
		int numerator;
		// Int numerator; Int must be lower cased
		int denominator;
		//integer denominator; int not integer

		System.out.println("This program divides two numbers.");
		//System.println("This program divides two numbers."); missing "out"
		System.out.print("Enter the numerator: ");
		//System.print("Enter the numerator: "); missing "out"
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		denominator = kbd.nextInt();
		//denomintaor = kbd.nextInt(); misspelled variable
		System.out.print(numerator);
		//system.out.print(numerator); Capitalize "system"
		System.out.print("/");
		System.out.print(denominator);
		//system.out.Print(denominator); Capitalize "system" and lower case "Print"
		System.out.print(" = ");
		System.out.println((double) numerator/denominator);
		//System.out.Println((double) numerator/denominator); lower case "Print"
	}
	
}
//added }