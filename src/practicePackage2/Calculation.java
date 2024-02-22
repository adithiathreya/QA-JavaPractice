package practicePackage2;

public class Calculation {
	public int a = 100;
	public int b = 200;

	//method without argument
	public void printSum() {
		int c = a+b;
		System.out.println("importing from another package");
		System.out.println("Sum of " + a + " + " + b + " = " + c);
	}
	
	//method with argument
	public void printSum1(int a, int b) {
		int c = a+b;
		System.out.println("method with argument");
		System.out.println("Sum of " + a + " + " + b + " = " + c);
	}
	
	//changing the return type
	public int printSum2(int a, int b) {
		int c = a+b;
		System.out.println("method with different return type");
		return c;
	}
}
