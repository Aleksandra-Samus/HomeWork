package ExtraHW;

public class ErrorDetection {

	public static void main(String[] args) {
		
		//create an array
		String [] flavour = {"vanilla", "chocolate", "strawberry", "mint","lemon","pistachio"};
		//print the element of the array
		System.out.println(flavour[0]);
		
		
		//create an array
		String [] flavour1 = {"vanilla", "chocolate", "strawberry", "mint","lemon"," "};
		//add an item to the array
		flavour1[5] = "pistachio";
		//print the element of the array
		System.out.println(flavour1[0]);

	}

}
