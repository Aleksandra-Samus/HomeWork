package OOPS;

import java.util.Scanner;

public class MainFilmSelection {

	public static void main(String[] args) {
		
		MovieForTheEvening movie1 = new MovieForTheEvening();
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your favorite movie genre");
		String genre = input.nextLine();
		movie1.choiceOfDirectorIsName(genre);
		
		String directorName = input.nextLine();
		movie1.movieTitleSelection(directorName);
		
		String movieTitle = input.nextLine();
		
		movie1.printMessage(genre, directorName, movieTitle);
	
	}
}
