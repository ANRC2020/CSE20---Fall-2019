import java.util.Scanner;
import java.util.Random;

public class BobcatHotel{
	public static void main(String[] args) {
		int numGuests, room, nights, meal, var1, var2; 
		boolean AAA, clubMember = true;
		double roomCost = 0, mealCost = 0, AAAdiscount, discount = 0, baseCost, finalCost, raffle; 
		
		Scanner in = new Scanner(System.in);
		Random randGen = new Random();
		
		System.out.println("ROOM OPTIONS\n" + "1. Single @ $50.50 per night\n" + "2. Double @ $75.00 per night\n" + "3. Queen @ $100.75 per night\n" + "4. King @ $150.25 per night\n" + "5. Master Suite @ $225.50 per night\n");
		System.out.print("Number of guests: ");
		numGuests = in.nextInt();
		System.out.print("Please your choice of room (enter 1/2/3/4/5 corresponding to the options shown above): ");
		room = in.nextInt();
		if(room == 1) {
			roomCost = 50.50;
		} else if(room == 2) {
			roomCost = 75.00;
		} else if(room == 3) {
			roomCost = 100.75;
		} else if(room == 4) {
			roomCost = 150.25;
		} else if(room == 5) {
			roomCost = 225.50;
		}
		System.out.print("Please enter the number of nights: ");
		nights = in.nextInt();
		System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)? ");
		var1= in.nextInt();
		switch ( var1 ) {
			case 1:
				AAA = true;
				break;
			case 0:
				AAA = false;
				break;
			default:
				System.out.println("Error, invalid option");
				break;
		}

		System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		var2 = in.nextInt();
		switch ( var2 ) {
		case 1:
			clubMember = true;
			break;
		case 0:
			clubMember = false;
			break;
		default:
			System.out.println("Error, invalid option");
			break;
		}
		
		System.out.println("");
		
		if(clubMember == true) {
			raffle = randGen.nextInt(9);
			if(raffle >= 4) {
				System.out.print("Congratulations! You've qualified for our \"Stay 4 nights get 1 free promotion\"\r\n" + "Discount will be applied during checkout depending on the number of days\n");
				discount = (nights / 4) * roomCost;
			} else {
				System.out.print("Unfortunately, you didn't qualify for our \"Stay 4 nights get 1 free promotion\". Better luck next time!\n");
			}
		} 
		
		System.out.println("");
		
		if(room == 5) {
			System.out.print("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)\r\n" + "0. Complementary @ $0 per guest\r\n" + "1. Standard @ $30 per guest\r\n" + "2. Deluxe @ $50 per guest\r\n" + "3. Indulgence @ $85 per guest\r\n" + "Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown above):");
			meal = in.nextInt();
			if(meal == 0) {
				mealCost = 0 * numGuests * nights;
			} else if(meal == 1) {
				mealCost = 30 * numGuests * nights;
			} else if(meal == 2) {
				mealCost = 50 * numGuests * nights;
			} else if(meal == 3) {
				mealCost = 85 * numGuests * nights;
			}
		} else {
			System.out.print("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)\n" + "0. Complementary @ $0 per guest\n" + "1. Standard @ $30 per guest\n" + "2. Deluxe @ $50 per guest\n" + "\n" + "Please select your desired meal package (enter 0/1/2 corresponding to the options shown above): ");
			meal = in.nextInt();
			if(meal == 0) {
				mealCost = 0 * numGuests * nights;
			} else if(meal == 1) {
				mealCost = 30 * numGuests * nights;
			} else if(meal == 2) {
				mealCost = 50 * numGuests * nights;
			} 
		}
		
		baseCost = nights * roomCost;
		AAAdiscount = .1 * (baseCost + mealCost);
		finalCost = (baseCost - AAAdiscount - discount);
				
		System.out.println("");
		
		System.out.println("CHECKOUT");	
		System.out.println("Base cost: \t\t\t" + baseCost);
		System.out.println("Meal Cost:\t\t\t" + mealCost);
		System.out.println("Preliminary Total Cost: \t" + (baseCost + mealCost));
		System.out.println("AAA Discount:\t\t\t" + AAAdiscount);
		System.out.println("Club Member Discount:\t\t" + discount);
		System.out.println("Total Cost of Booking: \t\t" + finalCost);
	}

}