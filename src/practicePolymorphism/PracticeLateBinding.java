package practicePolymorphism;

public class PracticeLateBinding extends PracticeOverloading {
	
	//overloading in child class based on same structure as in the parent class
	public void printSum(int a, int b) {
		System.out.println("Sum of two intergers squared " + a + " + " + b + " = " + (a*a+b*b));
	}
}
