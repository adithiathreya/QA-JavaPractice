package practicePackage;

//class
public class PracticeClass {

	//global variables
	int a = 10;
	//a = 70; global variable can't be changed outside of the class
	char b = 'x';
	String c = "java";
	float d = 10.5f;
	boolean e = true;
	double f = 10.5;
		
	//method
	public void printVariables() { //method declaration
		System.out.println("calling method"); //method body
		System.out.println("a = " + a + " \nb = " + b + " \nc = " + c + " \nd = " + d + " \ne = " + e + " \nf = " + f); //string concat for printing
		
		final int a = 100;
		//a = 200; final variable can't be changed as it is constant
		System.out.println("final a = " + a);
	}

}
