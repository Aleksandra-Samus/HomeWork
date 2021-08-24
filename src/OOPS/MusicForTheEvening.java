package OOPS;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class MusicForTheEvening {
	public String musicalGenre;
	public String artist;
	public String songName;
	
	public MusicForTheEvening(String musicalGenre, String artist, String songName) {
		this.musicalGenre = musicalGenre;
		this.artist = artist;
		this.songName = songName;
	}
	
	public MusicForTheEvening() {
		
	}
	public void printMessage(String musicalGenre, String artist, String songName) {
		System.out.println("Your music for the evening: ");
		System.out.println("Musical genre :: "+ musicalGenre);
		System.out.println("artist :: "+ artist);
		System.out.println("Song name :: "+songName);
		System.out.println("Happy listening! :-)");
	}
	
	public String choiceOfmusicalGenre(String musicalGenre) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose the serial number of your favorite musical genre :");
		System.out.println("1 -Rock, 2 -Pop, 3- Classic, 4- Rap, 5- Jas");
		
		int num = sc.nextInt();
		
		String [] array = {" ","rock","pop","classic","rap","jas"};
		for(int i=0; i<7; i++) {
			if (i==num) {
				musicalGenre = Arrays.asList(array).get(i);
			}
			
			
		}
		return musicalGenre;
	}
	
	
	public void choiceOfArtist(String musicalGenre) {
		switch (musicalGenre) {
		case "rock": 
			System.out.println("Please enter the artist name: ");
			System.out.println("Metallica");
			System.out.println("Nirvana");
			System.out.println("Trivium");
			break;
		case "pop": 
			System.out.println("Please enter the artist name: ");
			System.out.println("Maroon 5");
			System.out.println("Backstreet Boys");
			System.out.println("NSYNC");
			break;
		case "classic": 
			System.out.println("Please enter the artist name: ");
			System.out.println("Mozart");
			System.out.println("Beethoven");
			System.out.println("Tchaikovsky");
			break;
		case "rap": 
			System.out.println("Please enter the artist name: ");
			System.out.println("50 Cent");
			System.out.println("Eminem");
			System.out.println("Noize MC");
			break;
		case "jas": 
			System.out.println("Please enter the artist name: ");
			System.out.println("Albert Ayler");
			System.out.println("Art Tutum");
			System.out.println("Arturo Sandoval");
			break;
		default:
			System.out.println("Please, choose another musical genre!");
		}
	}
	public void choiceOfSongName(String artist) {
		switch (artist) {
		case "Metallica": 
			System.out.println("Please enter the song name");
			System.out.println("Nothing else matters");
			System.out.println("Of wolf and man");
			System.out.println("One");
			break;
		case "Nirvana": 
			System.out.println("Please enter the song name");
			System.out.println("Smells like teen spirit");
			System.out.println("The man who sold the world");
			System.out.println("Come as you are");
			break;
		case "Trivium": 
			System.out.println("Please enter the song name");
			System.out.println("In wales");
			System.out.println("Built to fall");
			System.out.println("The deceived");
			break;
		case "Maroon 5": 
			System.out.println("Please enter the song name");
			System.out.println("Sugar");
			System.out.println("Girls like you");
			System.out.println("She will be loved");
			break;
		case "Backstreet Boys": 
			System.out.println("Please enter the song name");
			System.out.println("I want it that way");
			System.out.println("I need you tonight");
			System.out.println("Everybody");
			break;
		case "NSYNC": 
			System.out.println("Please enter the song name");
			System.out.println("Bye bye bye");
			System.out.println("Just got paid");
			System.out.println("It's gonna be me");
			break;
		case "Mozart": 
			System.out.println("Please enter the song name");
			System.out.println("Requiem");
			System.out.println("Symphony #40");
			System.out.println("Piano Concerto #5");
			break;
		case "Beethoven": 
			System.out.println("Please enter the song name");
			System.out.println("Symphony #9");
			System.out.println("Moonlight sonata");
			System.out.println("Symphony #5");
			break;
		case "Tchaikovsky": 
			System.out.println("Please enter the song name");
			System.out.println("Walts of the flowers");
			System.out.println("Swan lake");
			System.out.println("Piano Concerto #1");
			break;
		case "50 Cent": 
			System.out.println("Please enter the song name");
			System.out.println("In da clab");
			System.out.println("Many men");
			System.out.println("Candy shop");
			break;
		case "Eminem": 
			System.out.println("Please enter the song name");
			System.out.println("Lose Yourself");
			System.out.println("Cleanin' out my closet");
			System.out.println("Without me");
			break;
		case "Noize MC": 
			System.out.println("Please enter the song name");
			System.out.println("Everything is like people's");
			System.out.println("Jordan");
			System.out.println("Make some Noize");
			break;
		case "Albert Ayler": 
			System.out.println("Please enter the song name");
			System.out.println("Summertime");
			System.out.println("Spiritual unity");
			System.out.println("Holy ghost");
			break;
		case "Art Tutum": 
			System.out.println("Please enter the song name");
			System.out.println("Tea for two");
			System.out.println("Tiger rag");
			System.out.println("Live");
			break;
		case "Arturo Sandoval": 
			System.out.println("Please enter the song name");
			System.out.println("High notes");
			System.out.println("Night in Tunisia");
			System.out.println("Marianela");
			break;
	
}
	}
}