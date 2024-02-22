package practiceAbstraction;

public class PracticeCallAbstractClass extends PracticeAbstractClass {

	//Overriding the unimplemented method from abstract class
	public void printMethod2() {
		a = 30;
		System.out.println("this is printed from called abstract class + this is implemented abstract method where value of a is changed to " + a);
	}

}
