package practiceMultipleInheritance;

public class PracticeFirstChild implements PracticeParentInterface {

	public void addition(int a, int b) {
		System.out.println("\nmultiple inheritance");
		System.out.println("FirstChild class implements ParentInterface's addition method, thus " + a + " + " + b + " = " + (a+b));
	}

}
