import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		String home;
		int age;
		String major;
		int year;
		
		System.out.print("What is your name? ");
		name = input.next();
		System.out.print("Where are you from? ");
		home = input.next();
		System.out.print("How old are you? ");
		age = input.nextInt();
		System.out.print("What is your major? ");
		major = input.next();
		System.out.print("What year are you in? (enter a number): ");
		year = input.nextInt();
		
		System.out.println(); 
		
		System.out.println("Their name is " + name);
		System.out.println("They are from " + home);
		System.out.println("They are " + age + " years old");
		System.out.println("Their major is " + major);
		System.out.println("They are in their " + year + "st/nd/rd year");
	}

}