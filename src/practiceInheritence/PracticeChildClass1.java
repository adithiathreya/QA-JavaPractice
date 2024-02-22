package practiceInheritence;

public class PracticeChildClass1 extends PracticeParentClass{
	
	//child class 1 constructor
	public PracticeChildClass1() {
		System.out.println("this is child class 1 which extends parent class");
	}
	
	//child class 1 constructor
	public PracticeChildClass1(int a, int b) {
		System.out.println("this is child class 1 which extends parent class");
		aOfPracticeParentClass = a;
		bOfPracticeParentClass = b;
	}

	//child class 1 method
	public int Addition() {
		return aOfPracticeParentClass+bOfPracticeParentClass;
	}

}
