package ExtraHW;

import java.util.Scanner;

public class DaysOfTheWeek {

	public static void main(String[] args) {
		
		DaysOfTheWeek day = new DaysOfTheWeek();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the day of the week ");
		String day1 = s.nextLine();
		day.weekdayOrWeekend(day1);
		
		System.out.println("Enter the number ");
		int dayNumber = s.nextInt();
		day.dayNameOfTheWeek(dayNumber);
		
	}	
	
		public void dayNameOfTheWeek(int day) {
			switch (day) {
				case 1:
					System.out.println(day +"- Monday");
					break;
				case 2:
					System.out.println(day+"- Tuesday");
					break;
				case 3:
					System.out.println(day+ "- Wednesday");
					break;
				case 4:
					System.out.println(day+"- Thursday");
					break;
				case 5:
					System.out.println(day+"- Friday");
					break;
				case 6:
					System.out.println(day+"- Saturday");
					break;
				case 7:
					System.out.println(day+"- Sunday");
					break;
				default:
					System.out.println(day+"- Not a valid day number");
					
			}
		}
		
		public void weekdayOrWeekend(String day) {
			switch(day) {
			case "Monday":
				System.out.println(day+" is a weekday");
				break;
			case "Tuesday":
				System.out.println(day+" is a weekday");
				break;
			case "Wednesday":
				System.out.println(day+" is a weekday");
				break;
			case "Thursday":
				System.out.println(day+" is a weekday");
				break;
			case "Friday":
				System.out.println(day+" is a weekday");
				break;
			case "Saturday":
				System.out.println(day+" is a weekend!");
				break;
			case "Sunday":
				System.out.println(day+" is a weekend!");
				break;
		}
		}
			
		}
	
