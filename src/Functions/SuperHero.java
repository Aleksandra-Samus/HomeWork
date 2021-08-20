package Functions;

public class SuperHero {

	public static void main(String[] args) {
		int count = 1;         
		for ( int i=0; i<11; i++) {             
			System.out.println(count);             
			myMethod ("Batman", 1000);            
			count ++;        
			}     
		}    
	static void myMethod(String sHeroName, int powerLevel){
		System.out.println("Super hero "+sHeroName+" with power level - "+powerLevel);    }

	}


