package practiceInheritence;

public class PracticeChildClass3 extends PracticeParentClass{
	
	//child class 3 constructor
	public PracticeChildClass3(int a, int b) {
		System.out.println("this is child class 3 which extends parent class");
		aOfPracticeParentClass = a;
		bOfPracticeParentClass = b;
	}

	//child class 3 method
	public int Multiplication(int a, int b) {
		return a*b;
	}

}
