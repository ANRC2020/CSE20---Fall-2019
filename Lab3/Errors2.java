import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int number = 0;
		int theSquare = 0;

		System.out.print("Enter a number and I will ");
		//System.out.print("Enter a number and I will")
		System.out.print("square it for you:  ");
		//System.out.print("square it for you:  ); Missing '"'
		number =  kbd.nextInt();
		//number =  keyboard.nextInt; must use "kbd" to head the statement

		theSquare = number * number;
		// thesquare = number * number; Must capitalize "s" in variable name

		System.out.print(number + " squared = ");
		//System.out.print(number + " squared = ";
		System.out.println(theSquare);
		//System.out.println("theSquare");
	}
}