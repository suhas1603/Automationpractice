package day9.nonstaticmethod;

public class Example3 {
	// Non static method
	int addNumber() {
		int num1 = 25, num2 = 85, res;
		res = num1 + num2;
		System.out.println("Number1 : " + num1);
		System.out.println("Number2 : " + num2);
		return res;
	}

	int addNumber(int num1, int num2) {
		int res = num1 + num2;
		System.out.println("Number1 : " + num1);
		System.out.println("Number2 : " + num2);
		return res;
	}

	public static void main(String[] args) {
		Example3 r1 = new Example3();
		r1.addNumber();// it will execute method body bt we wont be able to print return value
		System.out.println(r1.addNumber());// it gives us return value but we cant use it
		r1.addNumber(73, 17);
		System.out.println(r1.addNumber(45, 15));
		int sum = r1.addNumber(45, 15);
		System.out.println("sum = " + sum);
		int finalvalue = sum * 5;
		System.out.println("finalvalue" + finalvalue);
	}

}
