package day9.nonstaticmethod;

public class Example2 {

	double addNumber() {
		int num1 = 25, num2 = 75, res;
		res = num1 + num2;
		System.out.println("Number1 is : " + num1);
		System.out.println("Number2 is : " + num2);
		return res;
	}

	double addNumber(int num1, int num2) {
		double res = num1 + num2;
		System.out.println("Number1 is : " + num1);
		System.out.println("Number2 is : " + num2);
		return res;

	}

	double addNumber(double num1, int num2) {
		System.out.println("Number1 is : " + num1);
		System.out.println("Number2 is : " + num2);
		return num1 + num2;
	}

	double addNumber(int num1, double num2) {
		System.out.println("Number1 is : " + num1);
		System.out.println("Number2 is : " + num2);
		return num1 + num2;
	}

	public static void main(String[] args) {
		Example2 g1 = new Example2();
		System.out.println(g1.addNumber());// g1.addNumber();
		System.out.println(g1.addNumber(36, 24));
		System.out.println(g1.addNumber(37.5, 12));
		System.out.println(g1.addNumber(35, 10.5));
		double result=g1.addNumber(35, 10.5);
		System.out.println("Result : "+result);

	}

}
/*
 * when we declare same method multiple times in the same class with different type of parameter then that 
 * this concept is known as method overloading
 *	rule of method overloading:
 *		1. diff in number of argument
 *		2. diff in type of argument
 *		3. diff in position of argument
 *
 *	static/non-static:
 *			way to access
 *			check return type is required or not
 *			check parameter is required or not
 */

