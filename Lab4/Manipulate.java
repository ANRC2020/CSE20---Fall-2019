import java.util.Scanner;

public class Manipulate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1;
		int n2;
				
		//integer type tests
		System.out.println("Enter 2 integers: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		System.out.println("Sum of " + n1 + " and " + n2 + " is " + (n1 +n2));
		System.out.println("Difference of " + n1 + " and " + n2 + " is " + (n1-n2));
		System.out.println("Product of " + n1 + " and " + n2 + " is " + (n1*n2));
		System.out.println("Integer cast of (" + n1 + "/" + n2 + ") is " + (int)(n1/n2));
		System.out.println("Integer cast of (" + n1 + "%" + n2 +") is " + (int)(n1%n2));
		
		System.out.println("");
		
		//short type tests
		System.out.println("Enter 2 shorts(-32,768 to 32,767): ");
		n1 = input.nextShort();
		n2 = input.nextShort();
		System.out.println("Sum of " + n1 + " and " + n2 + " is " + (n1 +n2));
		System.out.println("Difference of " + n1 + " and " + n2 + " is " + (n1-n2));
		System.out.println("Product of " + n1 + " and " + n2 + " is " + (n1*n2));
		System.out.println("Short cast of (" + n1 + "/" + n2 + ") is " + (short)(n1/n2));
		System.out.println("Short cast of (" + n1 + "%" + n2 +") is " + (short)(n1%n2));
		
		System.out.println("");
		
		float n11;
		float n22;
		//short type tests
		System.out.println("Enter 2 floating points: ");
		n11 = input.nextFloat();
		n22 = input.nextFloat();		
		System.out.println("Sum of " + n11 + " and " + n22 + " is " + (n11 +n22));
		System.out.println("Difference of " + n11 + " and " + n22 + " is " + (n11-n22));
		System.out.println("Product of " + n11 + " and " + n22 + " is " + (n11*n22));
		System.out.println("Float cast of (" + n11 + "/" + n22 + ") is " + (float)(n11/n22));
		System.out.println("Float cast of (" + n11 + "%" + n22 +") is " + (float)(n11%n22));
		
		System.out.println("");
		
		//double type tests
		System.out.println("Enter 2 doubles: ");
		n11 = input.nextFloat();
		n22 = input.nextFloat();		
		System.out.println("Sum of " + n11 + " and " + n22 + " is " + (n11 +n22));
		System.out.println("Difference of " + n11 + " and " + n22 + " is " + (n11-n22));
		System.out.println("Product of " + n11 + " and " + n22 + " is " + (n11*n22));
		System.out.println("Double cast of (" + n11 + "/" + n22 + ") is " + (double)(n11/n22));
		System.out.println("Double cast of (" + n11 + "%" + n22 +") is " + (double)(n11%n22));
	}
}
