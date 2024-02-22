package practicePackage;

public class PracticeConstructor {
	
	public int aOfPracticeConstructor = 100;
	public int bofPracticeConstructor = 200;
	
	//constructor
	public PracticeConstructor() { //constructor name is same as the class name
		System.out.println("\nthis is a constructor");
	}
	
	//constructor with parameters
	public PracticeConstructor(int a, int b) {
		aOfPracticeConstructor = a;
		bofPracticeConstructor = b;
		System.out.println("this is a constructor with paramenters a = " + a + " b = " + b);
	}
	
	//method to print
	public void printValue() {
		System.out.println("a = " + aOfPracticeConstructor + " b = " + bofPracticeConstructor);
	}
}
