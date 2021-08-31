package LastHW;

import java.util.Scanner;

public class Maldives extends LuxuryVacation {
	protected String hotelName = "OZEN LIFE MAADHOO";
	protected String comfortLevel = "5 star";
	protected double price = 2307;
	
	public Maldives(String hotelName, String comfortLevel, double price) {
		super(hotelName, comfortLevel, price);
		
	}
	
	public void luxuryExcursion(){
			
			Scanner input = new Scanner (System.in);
			System.out.println("If you like relaxed vacation, then a vacation in Maldives is perfect for you!\r\n"
					+ "We offer you:\r\n"
					+ "1 - relaxing massage\r\n"
					+ "2 - anti-aging procedures ");
			int number = input.nextInt();
		
		if (number == 1) {
			System.out.println("A luxury mansion in the Maldives  "+hotelName+" with the "+comfortLevel+" level of comfort, price "+price+" $ per day");
			System.out.println("Additionally you will have an unforgettable relaxing massage!");
		}
		else {
			System.out.println("A luxury mansion in the Maldives  "+hotelName+" with the "+comfortLevel+" level of comfort, price "+price+" $ per day");
			System.out.println("Additionally you will have an unforgettable anti-aging procedures!");
		}
		
	}
}
