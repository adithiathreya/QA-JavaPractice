package practiceInterface;

//public class PracticeCallInterface extends PracticeInterface {   -> The type PracticeInterface cannot be the superclass of PracticeCallInterface; a superclass must be a class
public class PracticeCallInterface implements PracticeInterface {

	public void method1() {
		//a = 30;  -> The final field PracticeInterface.a cannot be assigned
		System.out.println("\nthis is an interface method whose constant is " + a);
	}
	
}
