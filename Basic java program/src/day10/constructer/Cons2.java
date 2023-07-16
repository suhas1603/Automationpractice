package day10.constructer;

public class Cons2 {
	Cons2() {
		System.out.println("This is a zero parameter constructer");
	}

	Cons2(char c) {
		System.out.println("This is a single parameter constructer");
	}

	Cons2(int num1, int num2) {
		System.out.println("This is int-int parameterized constructer");
	}

	Cons2(double num1, int num2) {
		System.out.println("This is double-int parameterized constructer");
	}

	Cons2(int num1, double num2) {
		System.out.println("This is int-double parameterized constructer");

	}

	public static void main(String[] args) {
		Cons2 c1 = new Cons2();
		Cons2 c2 = new Cons2('a');
		Cons2 c3 = new Cons2(25, 55);
		Cons2 c4 = new Cons2(45.5, 10);
		Cons2 c5 = new Cons2(5, 20.2);

	}
}