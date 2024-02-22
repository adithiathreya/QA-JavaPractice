package practiceInheritence;

public class PracticeParentClass {
	public int aOfPracticeParentClass;
	public int bOfPracticeParentClass;
	
	//parent class constructors
	public PracticeParentClass() {
		System.out.println("\nthis is parent class");
	}
	
	//parent class constructors with parameters
	public PracticeParentClass(int a, int b) {
		aOfPracticeParentClass = a;
		bOfPracticeParentClass = b;
	}
	
	//parent class method that will be used by all child classes
	public void printValue(String str, int x) {
		System.out.println("a = " + aOfPracticeParentClass + " b = " + bOfPracticeParentClass);
		System.out.println(str + " is " + x);
	}
}
