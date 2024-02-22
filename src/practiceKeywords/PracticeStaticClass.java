package practiceKeywords;

public class PracticeStaticClass {
	
	//int x = 10; -> Cannot make a static reference to the non-static field x
	static int x = 10;
	
	//static method
	public static void printValue() {
		System.out.println("\nusing static keyword");
		System.out.println("this is a static method with x = " + x);
	}
	
	//non static method
	public void printValue2() {
		x = 20;
		System.out.println("this is a non static method with x = " + x);
	}
			
}
