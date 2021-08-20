package ExtraHW;
import java.util.Scanner;

public class ErrorDetection2 {
	//Method for finding the max number in an array
	public static int max(int [] array) {
		int max = 0;
		for(int i=0; i<array.length; i++ ) {
			if(array[i]>max) {
				max = array[i];
				}
			} return max;
		}
	//Method for finding the min number in an array
	public static int min(int [] array) {
		int min = array[0];
		for(int i = 0; i<array.length; i++ ) {
			if(array[i]<min) {
				min = array[i];
			}
			} return min;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Prompts the user to enter the size of the array
		System.out.println("Enter the size of the array that is to becreated::");
		int size = sc.nextInt(); //read size of the array
		int[] myArray = new int[size]; // Create integer array 
		//Prompts the user to enter the elements of the array
		System.out.println("Enter the elements of the array ::");
		//fill the array with the values entered by the user
		for(int i=0; i<size; i++) {
			myArray[i] = sc.nextInt(); 
		}

			
		//print max value in the array
		System.out.println("Maximum value in the array is::"+max(myArray));
		//print max value in the array
		System.out.println("Minimum value in the array is::"+min(myArray));
	}
}
