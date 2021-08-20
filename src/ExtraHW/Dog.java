package ExtraHW;

public class Dog {
public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.Breed("Golden Retriver");
		dog1.dogAge(5);
		
		}
	
	public void Breed(String Breed) {
		switch (Breed) {
		case "Golden Retriver":
			System.out.println(Breed+" - this is a big dog");
			break;
		case "Beagle":
			System.out.println(Breed+" - this is a medium dog");
			break;
		case "pug":
			System.out.println(Breed+" - this is a small dog");
			break;
		}
	}
	public void dogAge(int Age) {
		switch (Age){
			case 1:
				System.out.println(Age + "- this is a pappy");
				break;
			case 2:
				System.out.println(Age+"- this is a young adult dog");
				break;
			case 3:
				System.out.println(Age+"- this is a adult dog");
				break;
			case 4:
				System.out.println(Age+"- this is a adult dog");
				break;
			case 5:
				System.out.println(Age+"- this is a adult dog");
				break;
			case 6:
				System.out.println(Age+"- this is a adult dog");
				break;
			case 7:
				System.out.println(Age+"- this is a adult dog");
				break;
			case 8:
				System.out.println(Age+"- this is a senior dog");
				break;
		}
	
		}

	
	}


