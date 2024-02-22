package practiceMultipleInheritance;

public class PracticeSecondChild extends PracticeFirstChild implements PracticeChildInterface {

	public void addition(int a, int b, int c) {
		System.out.println("SecondChild class implements ChildInterface class's addition method, thus " + a + " + " + b + " + " + c + " = " + (a+b+c));
	}
	
	//method can be either overridden or used from super class
	/*
	public void addition(int a, int b) {
		System.out.println("SecondChild class extends FirstChild class' addition method, thus " + a + "*" + a + " + " + b + "*" + b + " = " + (a*a+b*b));
	}*/

}
