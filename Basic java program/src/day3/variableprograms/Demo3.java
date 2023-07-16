package day3.variableprograms;

public class Demo3 {

	public static void main(String[] args) {

		int x = 50;
		float y = 10.0f;
		double z = x + y;
		System.out.println("********Addition********");
		System.out.println("Number1 =" + x);
		System.out.println("Number2 =" + y);
		System.out.println("Result =" + z);

		System.out.println("********Subtraction********");
		z = x - y;
		System.out.println("Number1 =" + x);
		System.out.println("Number2 =" + y);
		System.out.println("Result =" + z);

		System.out.println("********Multiplication********");
		x = 100;
		y = 12.25f;
		z = x * y;
		System.out.println("Number1 =" + x);
		System.out.println("Number2 =" + y);
		System.out.println("Result =" + z);

		System.out.println("********Division********");
		y = 12.5f;
		z = x / y;
		System.out.println("Number1 =" + x);
		System.out.println("Number2 =" + y);
		System.out.println("Result =" + z);

		System.out.println("********Mod********");
		x = 52;
		y = 5.0f;
		z = x % y;
		System.out.println("Number1 =" + x);
		System.out.println("Number2 =" + y);
		System.out.println("Result =" + z);

	}

}
