package OOPS_1;

import java.util.Scanner;

public class CyberAttackProtection {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
		
		System.out.println("Please, enter your name.");
		String name = input.nextLine();
		
		System.out.println("Please, enter your surname.");
		String surname = input.nextLine();
		
		System.out.println("Please, enter your year of birth.");
		int yearOfBirth = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Please, enter your id.");
		int id = input.nextInt();
		input.nextLine();
		
		System.out.println("Please, enter your social insurance number");
		int sin = input.nextInt();
		input.nextLine();
		
		System.out.println("Please, enter your address.");
		String address = input.nextLine();
		
		System.out.println("Please, enter your E-mail.");
		String mail = input.nextLine();
		
		PersonalData person1 = new PersonalData(name, surname, yearOfBirth, id, sin, address, mail);
		
		person1.print();

}
}