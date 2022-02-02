import java.util.Scanner;

public class Errors1 {
//Added {
	
	public static void main(String[] args) {
	//Added {
		System.out.println("Can you spot and fix the errors?");
		//System.out.println("Can you spot and fix the errors?'); needs double apostrophes

		System.out.println("Enter two numbers and I will ");
		System.out.println("add them for you");

		int n1, n2;

		Scanner keyboard = new Scanner(System.in);
		//Scanner keyboard = new Scanner(System.in) lacks a ;
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		// must use "keyboard" to precede ".nextInt" for both variables 
		
		System.out.println("The sum of the number is");
		//System.println("The sum of the numbers is");
		System.out.println(n1 + n2);
		//System.out.println(n1 - n2); incorrect operation
	}
}