package practiceKeywords;

public class PracticeKeywordsClass extends PracticeSuperClass {
	int x = 10; //global variable
	int y = 100;
	
	public void printX() {
		
		//'this' keyword
		int x = 20; //local variable
		System.out.println("\nusing this keyword");
		System.out.println("value of local variable x = " + x + "\nvalue of global variable x = " + this.x);
		
		//'final' keyword
		final int y = 200;
		System.out.println("\nusing final keyword");
		System.out.println("value of local variable y = " + y + "\nvalue of global variable y = " + this.y);
		//y = 40; -> The final local variable y cannot be assigned. It must be blank and not using a compound assignment
		//final class cannot be extended
		//final method cannot be overridden
		
		//'super' keyword
		System.out.println("\nusing super keyword");
		System.out.println("value of global variable in current class x = " + this.x + "\nvalue of global variable in parent class x = " + super.x);
		super.printX();
		
	}
	
}
