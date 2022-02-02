import java.util.Scanner;

public class Interview2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, home, major;
		int age, year;
		float height;
		
		System.out.print("What is your full name? ");
		name = input.nextLine();
		System.out.print("Where are you from? ");
		home = input.next();
		System.out.print("How old are you? ");
		age = input.nextInt();
		System.out.print("How tall are you in inches? ");
		height = input.nextFloat();
		System.out.print("What is your major? ");
		major = input.next();
		System.out.print("What year are you in? (enter a number): ");
		year = input.nextInt();
		
		System.out.println(); 
		
		System.out.print("Their name is " + name);
		System.out.print("They are from " + home);
		System.out.print("They are " + age + " years old");
		System.out.print("They are " + (height * 2.45) + " cm tall");
		System.out.print("Their major is " + major);
		System.out.print("They are in their " + year + "st/nd/rd year");
	}

}