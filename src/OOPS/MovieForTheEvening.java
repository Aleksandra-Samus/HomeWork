package OOPS;

import java.util.Arrays;
import java.util.Scanner;


public class MovieForTheEvening {
	
public String genre;
public String directorName;
public String movieTitle;

public MovieForTheEvening(String genre, String directorName, String movieTitle) {
	super();
	this.genre = genre;
	this.directorName = directorName;
	this.movieTitle = movieTitle;
}
public MovieForTheEvening() {
	super();
}

public void printMessage(String genre, String directorName, String movieTitle) {
	System.out.println("Your movie for the evening: ");
	System.out.println("Movie genre :: "+ genre);
	System.out.println("Movie director :: "+ directorName);
	System.out.println("Movie title :: "+movieTitle);
	System.out.println("Happy watching! :-)");
}

public String choiceOfGenre(String genre) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please choose the serial number of your favorite genre :");
	System.out.println("1 -Horror, 2 -Comedy, 3- Action, 4- Drama, 5- Science fiction, 6- Documentary");
	
	int num = sc.nextInt();
	
	String [] array = {" ","Horror","Comedy","Action","Drama","Science fiction","Documentary"};
	for(int i=0; i<8; i++) {
		if (i==num) {
			genre = Arrays.asList(array).get(i);
		}
		
		
	}
	return genre;
}

public void choiceOfDirectorIsName(String genre){
	switch (genre) {
		case "Horror": 
			System.out.println("Please enter the name of the director: ");
			System.out.println("David Cronenberg");
			System.out.println("Alfred Hitchcock");
			System.out.println("Ari Aster");
			break;
		case "Comedy": 
			System.out.println("Please enter the name of the director: ");
			System.out.println("Woody Allen");
			System.out.println("Ben Stiller");
			System.out.println("Kevin Smith");
			break;
		case "Action": 
			System.out.println("Please enter the name of the director: ");
			System.out.println("James Cameron");
			System.out.println("John Woo");
			System.out.println("Stiven Spielberg");
			break;
		case "Drama": 
			System.out.println("Please enter the name of the director: ");
			System.out.println ("Ethan Coen");
			System.out.println ("Spike Lee");
			System.out.println ("David Fincher");
			break;
		case "Science fiction": 
			System.out.println("Please enter the name of the director: ");
			System.out.println ("Christopher Nolan");
			System.out.println ("Ridley Scott");
			System.out.println ("Robert Zemeckis");
			break;
		case "Documentary": 
			System.out.println("Please enter the name of the director: ");
			System.out.println("Michael Moore");
			System.out.println("Errol Morris");
			System.out.println("Alex Gibney");
			break;
	default:
		System.out.println("Please, choose another genre!");	
	}
}
	public void movieTitleSelection(String directorName) {
		switch(directorName) {
		case "David Cronenberg":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("The Fly");
			System.out.println("Crash");
			System.out.println("Rabid");
			break;
		case "Alfred Hitchcock":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("Psycho");
			System.out.println("The Birds");
			System.out.println("Lifeboat");
			break;
		case "Ari Aster":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("Beau");
			System.out.println("Hereditary");
			System.out.println("Midsommar");
			break;
		case "Woody Allen":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("A rainy day in New York");
			System.out.println("Vicky Cristina Barcelona");
			System.out.println("Manhattan");
			break;
		case "Ben Stiller":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("The secret life of Walter Mitty");
			System.out.println("Tropic Thunder");
			System.out.println("Zoolander");
			break;
		case "Kevin Smith":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("Dogma");
			System.out.println("Clerks");
			System.out.println("Jersey Girl");
			break;
		case "James Cameron":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("Avatar");
			System.out.println("Terminator");
			System.out.println("True Lies");
			break;
		case "John Woo":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("Fase Off");
			System.out.println("Broken Arrow");
			System.out.println("Red Cliff");
			break;
		case "Stiven Spielberg":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("War of the worlds");
			System.out.println("Indiana Jones");
			System.out.println("Jaws");
			break;
		case "Ethan Coen":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("True grit");
			System.out.println("A serious man");
			System.out.println("Burn after reading");
			break;
		case "Spike Lee":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("Oldboy");
			System.out.println("25-th hour");
			System.out.println("Bamboozled");
			break;
		case "David Fincher":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("The social network");
			System.out.println("Gone girl");
			System.out.println("The game");
			break;
		case "Christopher Nolan":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("Inception");
			System.out.println("Tenet");
			System.out.println("Interstellar");
			break;
		case "Ridley Scott":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("The marcian");
			System.out.println("Alien");
			System.out.println("Blade runner");
			break;
		case "Robert Zemeckis":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("Back to the Future");
			System.out.println("Contact");
			System.out.println("Beowulf");
			break;
		case "Michael Moore":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("Bowling for Columbine");
			System.out.println("Fahrenheit 9/11");
			System.out.println("Sicko");
			break;
		case "Errol Morris":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("Fast, Cheap and out of control");
			System.out.println("The fog of war");
			System.out.println("The thin blue line");
			break;
		case "Alex Gibney":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("Taxi to the dark side");
			System.out.println("The smartest guys in the room");
			System.out.println("Going clear");
			break;
		default:
			System.out.println("Please, choose another title movie!");
		}
	}

}

















