package practiceAbstraction;

//public class PracticeAbstractClass {   -> (concrete class) cannot be declared if the class has an abstract method
public abstract class PracticeAbstractClass { //abstract class declaration
	
	int a = 10;//variable
	
	//concrete method
	public void printMethod() {
		System.out.println("\nthis is printed from abstract class + this is a concrete method with value of variable a is " + a);
		a = 20;
		System.out.println("changed value of a in concrete method of abstract class is " + a);
	}
	
	//abstract method
	public abstract void printMethod2();
}
