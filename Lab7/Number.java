import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 1-26: ");
		int num = input.nextInt();
		if(!((num <= 26) && (num >= 0))) {
			System.out.println("Invalid Input! Number is outside of acceptable range.");
		} else {
			System.out.println("Character " + num + " of the alphabet is " + (char)(num + 64));
		}
	}

}
