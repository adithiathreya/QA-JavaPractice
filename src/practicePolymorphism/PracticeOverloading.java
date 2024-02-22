package practicePolymorphism;

public class PracticeOverloading {
	
	//early binding example
	//method
	public void printSum(int a, int b) {
		System.out.println("\nSum of two intergers " + a + " + " + b + " = " + (a+b));
	}
	
	//overloading method with different type of parameters
	public void printSum(int a, float b) {
		float c = a+b;
		System.out.println("Sum of one interger and one float number " + a + " + " + b + " = " + c);
	}
	
	//overloading method with different number of parameters
	public void printSum(int a, int b, int c) {
		System.out.println("Sum of three intergers " + a + " + " + b  + " + " + c + " = " + (a+b+c));
	}
	
}
