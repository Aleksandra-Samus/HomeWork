package LastHW;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Please select the type of holiday: ");
		System.out.println("1 - do you like swimming");
		System.out.println("2 - do you like monkeys");
		System.out.println("3 - do you like relaxed vacation");
		
		int activity = input.nextInt();
		
		if (activity == 1) {
			BoraBora island1 = new BoraBora(null, null, activity);
			island1.luxuryExcursion();
			
		}
		if (activity == 2) {
			Bali island2 = new Bali(null, null, activity);
			island2.luxuryExcursion();
			
		}
		else {
			Maldives island3 = new Maldives(null, null, activity);
			island3.luxuryExcursion();
			
		}
	}

}
