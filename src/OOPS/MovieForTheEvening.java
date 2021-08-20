package OOPS;

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

public void choiceOfDirectorIsName(String genre){
	switch (genre) {
		case "Horror": 
			System.out.println("Please enter the name of the director: ");
			System.out.println("1 - David Cronenberg");
			System.out.println("2 - Alfred Hitchcock");
			System.out.println("3 - Ari Aster");
			break;
		case "Comedy": 
			System.out.println("Please enter the name of the director: ");
			System.out.println("1 - Woody Allen");
			System.out.println("2 - Ben Stiller");
			System.out.println("3 - Kevin Smith");
			break;
		case "Ection": 
			System.out.println("Please enter the name of the director: ");
			System.out.println("1 - James Cameron");
			System.out.println("2 - John Woo");
			System.out.println("3 - Stiven Spielberg");
			break;
		case "Drama": 
			System.out.println("Please enter the name of the director: ");
			System.out.println ("1 - Ethan Coen");
			System.out.println ("2 - Spike Lee");
			System.out.println ("3 - David Fincher");
			break;
		case "Science fiction": 
			System.out.println("Please enter the name of the director: ");
			System.out.println ("1 - Christopher Nolan");
			System.out.println ("2 - Ridley Scott");
			System.out.println ("3 - Robert Zemeckis");
			break;
		case "Documentary": 
			System.out.println("Please enter the name of the director: ");
			System.out.println("1 - Michael Moore");
			System.out.println("2 - Errol Morris");
			System.out.println("3 - Alex Gibney");
			break;
	default:
		System.out.println("Please, choose another genre!");	
	}
}
	public void movieTitleSelection(String directorName) {
		switch(directorName) {
		case "David Cronenberg":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - The Fly");
			System.out.println("2 - Crash");
			System.out.println("3 - Rabid");
			break;
		case "Alfred Hitchcock":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - Psycho");
			System.out.println("2 - The Birds");
			System.out.println("3 - Lifeboat");
			break;
		case "Ari Aster":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - Beau");
			System.out.println("2 - Hereditary");
			System.out.println("3 - Midsommar");
			break;
		case "Woody Allen":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - A rainy day in New York");
			System.out.println("2 - Vicky Cristina Barcelona");
			System.out.println("3 - Manhattan");
			break;
		case "Ben Stiller":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - The secret life of Walter Mitty");
			System.out.println("2 - Tropic Thunder");
			System.out.println("3 - Zoolander");
			break;
		case "Kevin Smith":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - Dogma");
			System.out.println("2 - Clerks");
			System.out.println("3 - Jersey Girl");
			break;
		case "James Cameron":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - Avatar");
			System.out.println("2 - Terminator");
			System.out.println("3 - True Lies");
			break;
		case "John Woo":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - Fase Off");
			System.out.println("2 - Broken Arrow");
			System.out.println("3 - Red Cliff");
			break;
		case "Stiven Spielberg":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - War of the worlds");
			System.out.println("2 - Indiana Jones");
			System.out.println("3 - Jaws");
			break;
		case "Ethan Coen":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - True grit");
			System.out.println("2 - A serious man");
			System.out.println("3 - Burn after reading");
			break;
		case "Spike Lee":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - Oldboy");
			System.out.println("2 - 25-th hour");
			System.out.println("3 - Bamboozled");
			break;
		case "David Fincher":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - The social network");
			System.out.println("2 - Gone girl");
			System.out.println("3 - The game");
			break;
		case "Christopher Nolan":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - Inception");
			System.out.println("2 - Tenet");
			System.out.println("3 - Interstellar");
			break;
		case "Ridley Scott":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - The marcian");
			System.out.println("2 - Alien");
			System.out.println("3 - Blade runner");
			break;
		case "Robert Zemeckis":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - Back to the Future");
			System.out.println("2 - Contact");
			System.out.println("3 - Beowulf");
			break;
		case "Michael Moore":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - Bowling for Columbine");
			System.out.println("2 - Fahrenheit 9/11");
			System.out.println("3 - Sicko");
			break;
		case "Errol Morris":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - Fast, Cheap and out of control");
			System.out.println("2 - The fog of war");
			System.out.println("3 - The thin blue line");
			break;
		case "Alex Gibney":
			System.out.println("Please choose a title for your movie: ");
			System.out.println("1 - Taxi to the dark side");
			System.out.println("2 - The smartest guys in the room");
			System.out.println("3 - Going clear");
			break;
		default:
			System.out.println("Please, choose another title movie!");
		}
	}

}

















