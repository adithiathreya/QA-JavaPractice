package practiceInheritence;

public class PracticeChildClass2 extends PracticeChildClass1{
	
	//child class 2 constructor
	public PracticeChildClass2(int a, int b) {
		System.out.println("this is child class 2 which extends child class 1");
		aOfPracticeParentClass = a;
		bOfPracticeParentClass = b;
	}

	//child class 2 method
	public int Subtraction(int a, int b) {
		return a-b;
	}
}
