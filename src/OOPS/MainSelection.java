package OOPS;

import java.util.Scanner;

public class MainSelection {
	
	public void entertainmentPreference() {
				
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your favorite entertainment preference");
		System.out.println("music");
		System.out.println("movie");
		System.out.println("book");
		String preference = input.nextLine();
		
		if (preference.equals("movie")) {
			MovieForTheEvening movie1 = new MovieForTheEvening();
			
			String genre = movie1.choiceOfGenre(preference);
			
			 
			movie1.choiceOfDirectorIsName(genre);
			
			String directorName = input.nextLine();
			movie1.movieTitleSelection(directorName);
			
			String movieTitle = input.nextLine();
			
			movie1.printMessage(genre, directorName, movieTitle);
		
		}
		
		else 
			if (preference.equals("music")) {
			
			MusicForTheEvening music1 = new MusicForTheEvening();
			
			
			String musicalGenre = music1.choiceOfmusicalGenre(preference);
			
			music1.choiceOfArtist(musicalGenre);
			
			String artist = input.nextLine();
			music1.choiceOfSongName(artist);
			
			String songName = input.nextLine();
			
			music1.printMessage(musicalGenre, artist, songName);
			
		}
			else 
				if (preference.equals("book")) {
				
				BookForTheEvening book1 = new BookForTheEvening();
				
				
				String bookGenre = book1.choiceOfBookGenre(preference);
				
				book1.choiceOfAuthor(bookGenre);
				
				String autor = input.nextLine();
				book1.choiceOfBookTitle(autor);
				
				String bookTitle = input.nextLine();
				
				book1.printMessage(bookGenre, autor, bookTitle);
				
			}
				else
					System.out.println("Please, try again!");
			
		
		
}
}
