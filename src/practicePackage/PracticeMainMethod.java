package practicePackage;

import practiceAbstraction.*;
import practiceFileHandling.*;
import practiceInheritence.*;
import practiceInterface.*;
import practiceKeywords.*;
import practiceMultipleInheritance.*;
import practicePackage2.Calculation;
import practicePolymorphism.*;

public class PracticeMainMethod {
	//main method
	public static void main(String[] args) throws Exception {
		//Hello Java
		System.out.println("Hello Java");
		
		//local variables
		int a = 20;
		int b = 10;
		int c = a+b;
		
		//printing local variable
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		
		//object creation - initialization and instantiation
		PracticeClass pc = new PracticeClass();
		
		//calling method
		pc.printVariables();
		
		//calling global variables
		System.out.println("public a = " + pc.a);
		
		//calling another class
		PracticeClass2 pc2 = new PracticeClass2();
		pc2.printVariable(pc.a);
		
		//calling class in another package
		Calculation cal = new Calculation();
		cal.printSum();
		
		//passing arguments
		cal.printSum1(cal.a, cal.b);
		
		//passing arguments and getting a return value
		c = cal.printSum2(cal.a, cal.b);
		int d = cal.printSum2(cal.b, c);
		System.out.println("Sum of " + cal.a + " + " + cal.b + " + " + c + " = " + d);
		
		//calling a constructor
		PracticeConstructor pC = new PracticeConstructor();
		pC.printValue();
		
		//calling a constructor with parameters
		PracticeConstructor pC2 = new PracticeConstructor(a, b);
		pC2.printValue();
		
		//calling parent class
		PracticeParentClass pPC = new PracticeParentClass();
		pPC.printValue("No arithmatic operations", 1000);
		
		//calling parent class with parameters
		PracticeParentClass pPC2 = new PracticeParentClass(a, b);
		pPC2.printValue("No arithmatic operations", pPC2.aOfPracticeParentClass);
		
		//calling child class 1
		PracticeChildClass1 pCC1 = new PracticeChildClass1(a, b);
		int pCC1Value = pCC1.Addition();//calling child class 1 method
		pCC1.printValue("Addition of a + b", pCC1Value);//calling parent class method form child class 1 object
		
		//calling child class 2
		PracticeChildClass2 pCC2 = new PracticeChildClass2(a, b);
		int pCC2Value1 = pCC2.Addition();//calling child class 1 method
		pCC2.printValue("Addition of a + b ", pCC2Value1);//calling parent class method form child class 2 object
		int pCC2Value2 = pCC2.Subtraction(a, b);//calling child class 2 method
		pCC2.printValue("Subtraction of a - b", pCC2Value2);//calling parent class method form child class 2 object
		
		//calling child class 3
		PracticeChildClass3 pCC3 = new PracticeChildClass3(a, b);
		int pCC3Value = pCC3.Multiplication(a, b);//calling child class 3 method
		pCC3.printValue("Multiplication of a * b", pCC3Value);//calling parent class method form child class 3 object
		
		//calling Overloading methods
		PracticeOverloading pO = new PracticeOverloading();
		pO.printSum(100, 200);//calling method 'sum' with 2 integers as parameters
		pO.printSum(100, 2.2f);// calling method 'sum' with an integer and a float number as parameters
		pO.printSum(100, 200, 300);//calling method 'sum' with 3 integers as parameters
		PracticeLateBinding pLB = new PracticeLateBinding();
		pLB.printSum(10, 20);//calling child class method
		
		//calling abstract methods
		//PracticeAbstractClass pAC = new PracticeAbstractClass();  -> Cannot instantiate the type PracticeAbstractClass
		PracticeCallAbstractClass pCAC = new PracticeCallAbstractClass();
		pCAC.printMethod();//calling concrete method in abstract class
		pCAC.printMethod2();//calling abstract method
		
		//calling interface method
		PracticeCallInterface pCI = new PracticeCallInterface();
		pCI.method1();
		
		//calling multiple inheritance
		PracticeFirstChild pFC = new PracticeFirstChild();
		pFC.addition(10, 20);
		PracticeSecondChild pSC = new PracticeSecondChild();
		pSC.addition(10, 20);
		pSC.addition(10, 20, 30);
		
		//calling keyword class methods
		PracticeKeywordsClass pKC = new PracticeKeywordsClass();
		pKC.printX();
		
		//calling PracticeStatic class methods
		PracticeStaticClass.printValue(); //static method can be called directly using class reference, instead of creating an object
		PracticeStaticClass pStC = new PracticeStaticClass();
		pStC.printValue2();
		
		//calling File Handling class method
		PracticeFileHandlingClass.readFile();
		PracticeFileHandlingClass.writeFile();
		PracticeFileHandlingClass.readPropertiesFile();
		
	}
}
