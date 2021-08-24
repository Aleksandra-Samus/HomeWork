package OOPS_2;

import java.util.Arrays;
import java.util.Scanner;

public class BookForTheEvening {
	public String bookGenre;
	public String author;
	public String bookTitle;
	
public BookForTheEvening(String bookGenre, String author, String bookTitle) {
		super();
		this.bookGenre = bookGenre;
		this.author = author;
		this.bookTitle = bookTitle;
	}
	public BookForTheEvening() {
		
	}
public void printMessage(String bookGenre, String author, String bookTitle) {
		System.out.println("Your book for the evening: ");
		System.out.println("Book genre :: "+ bookGenre);
		System.out.println("author :: "+ author);
		System.out.println("Book title :: "+bookTitle);
		System.out.println("Happy reading! :-)");
	}
	
public String choiceOfBookGenre(String bookGenre) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose the serial number of your favorite book genre :");
		System.out.println("1 -Detective, 2 -Science fiction, 3- Novel, 4- Children's literature, 5- Adventure");
		
		int num = sc.nextInt();
		
		String [] array = {" ","Detective","Science fiction","Novel","Children's literature","Adventure"};
		for(int i=0; i<7; i++) {
			if (i==num) {
				bookGenre = Arrays.asList(array).get(i);
			}
			
			
		}
		return bookGenre;
	}

public void choiceOfAuthor(String bookGenre) {
	switch (bookGenre) {
	case "Detective": 
		System.out.println("Please enter the author name: ");
		System.out.println("Agatha Christie");
		System.out.println("Wilkie Collins");
		System.out.println("Arthur Conan Doyle");
		break;
	case "Science fiction": 
		System.out.println("Please enter the author name: ");
		System.out.println("Ann Leckie");
		System.out.println("Martha Wells");
		System.out.println("John Scalzi");
		break;
	case "Novel": 
		System.out.println("Please enter the author name: ");
		System.out.println("William Shakespeare");
		System.out.println("Ernest Hemingway");
		System.out.println("Charles Dickens");
		break;
	case "Children's literature": 
		System.out.println("Please enter the author name: ");
		System.out.println("Astrid Lindgren");
		System.out.println("J. K. Rowling");
		System.out.println("Perro Sharl");
		break;
	case "Adventure": 
		System.out.println("Please enter the author name: ");
		System.out.println("Jules Verne");
		System.out.println("Jack London");
		System.out.println("Alexandre Dumas");
		break;
	default:
		System.out.println("Please, choose another book genre!");

}
}

public void choiceOfBookTitle(String author) {
	switch (author) {
	case "Agatha Christie": 
		System.out.println("Please enter the song name");
		System.out.println("The big four");
		System.out.println("The mystery of the blue train");
		System.out.println("The seven dails mystery");
		break;
	case "Wilkie Collins": 
		System.out.println("Please enter the song name");
		System.out.println("The women in white");
		System.out.println("The moonstone");
		System.out.println("Heart ang scince");
		break;
	case "Arthur Conan Doyle": 
		System.out.println("Please enter the song name");
		System.out.println("Sherlock Holmes");
		System.out.println("The lost world");
		System.out.println("The sign of the four");
		break;
	case "Ann Leckie": 
		System.out.println("Please enter the song name");
		System.out.println("The raven tower");
		System.out.println("Provenance");
		System.out.println("The mythic dream");
		break;
	case "John Scalzi": 
		System.out.println("Please enter the song name");
		System.out.println("Old man's war");
		System.out.println("Red shirts");
		System.out.println("The last colony");
		break;
	case "William Shakespeare": 
		System.out.println("Please enter the song name");
		System.out.println("Hamlet");
		System.out.println("Romeo and Juliet");
		System.out.println("Macbeth");
		break;
	case "Ernest Hemingway": 
		System.out.println("Please enter the song name");
		System.out.println("The old man and the sea");
		System.out.println("For whom the bell tolls");
		System.out.println("The Sun Also Rises");
		break;
	case "Charles Dickens": 
		System.out.println("Please enter the song name");
		System.out.println("Oliver Tvist");
		System.out.println("Greate expectations");
		System.out.println("Break house");
		break;
	case "Astrid Lindgren": 
		System.out.println("Please enter the song name");
		System.out.println("Pippi");
		System.out.println("Karlsson");
		System.out.println("The brothers Lionheart");
		break;
	case "J. K. Rowling": 
		System.out.println("Please enter the song name");
		System.out.println("Harry Potter");
		System.out.println("The Ickabog");
		System.out.println("Fantastic beasts");
		break;
	case "Perro Sharl": 
		System.out.println("Please enter the song name");
		System.out.println("Cinderella");
		System.out.println("Little red riding hood");
		System.out.println("Cat in boots");
		break;
	case "Jules Verne": 
		System.out.println("Please enter the song name");
		System.out.println("Around the world in 80 days");
		System.out.println("Journey to the center of the earth");
		System.out.println("Round the moon");
		break;
	case "Jack London": 
		System.out.println("Please enter the song name");
		System.out.println("White fang");
		System.out.println("The sea wolf");
		System.out.println("Martin Eden");
		break;
	case "Alexandre Dumas": 
		System.out.println("Please enter the song name");
		System.out.println("The three Musketeers");
		System.out.println("The count of Monte Cristo");
		System.out.println("The black tulip");
		break;
}
}

}
