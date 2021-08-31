package LastHW;

import java.util.Scanner;

public class Bali extends LuxuryVacation {
	protected String hotelName = "Samabe Bali Suites & Villas";
	protected String comfortLevel = "5 star";
	protected double price = 512;
	
	public Bali(String hotelName, String comfortLevel, double price) {
		super(hotelName, comfortLevel, price);
		
	}
	
	public void luxuryExcursion(){
			
			Scanner input = new Scanner (System.in);
			System.out.println("If you like monkeys, then a vacation in Bali is perfect for you!\r\n"
					+ "We offer you:\r\n"
					+ "1 - trip to a monkey forest\r\n"
					+ "2 - walk on the beach");
			int number = input.nextInt();
		
		if (number == 1) {
			System.out.println("A luxury mansion in the Bali "+hotelName+" with the "+comfortLevel+" level of comfort, price "+price+"  $ per day");
			System.out.println("Additionally you will have an unforgettable trip to a monkey forest!");
		}
		else {
			System.out.println("A luxury mansion in the Bali "+hotelName+" with the "+comfortLevel+" level of comfort, price "+price+"  $ per day");
			System.out.println("Additionally you will have an unforgettable walk on the beach!");
		}
		
	}
}
