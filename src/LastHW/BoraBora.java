package LastHW;

import java.util.Scanner;

public class BoraBora extends LuxuryVacation {
	
	protected String hotelName = "The St. Regis Bora Bora Resort";
	protected String comfortLevel = "5 star";
	protected double price = 2800;
	
	public BoraBora(String hotelName, String comfortLevel, double price) {
		super(hotelName, comfortLevel, price);
		
	}
	
	public void luxuryExcursion(){
			
			Scanner input = new Scanner (System.in);
			System.out.println("If you like to swim, then a vacation in Bora Bora is perfect for you!\r\n"
					+ "We offer you:\r\n"
					+ "1 - scuba diving\r\n"
					+ "2 - yacht tour");
			int number = input.nextInt();
		
		if (number == 1) {
			System.out.println("A luxury mansion in the Bora Bora "+hotelName+" with the "+comfortLevel+" level of comfort, price "+price+" $ per day");
			System.out.println("Additionally you will enjoy scuba diving");
		}
		else {
			System.out.println("A luxury mansion in the Bora Bora "+hotelName+" with the "+comfortLevel+" level of comfort, price "+price+" $ per day");
			System.out.println("Additionally you will go to a yacht tour");
		}
		
	}
}
