package day19.polymorphism;

public class CompileTime {

	static void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers :" + c);
	}

	static void sum(int a, int b, int e) {
		int c = a + b + e;
		System.out.println("Addition of three num :" + c);
	}

	public static void main(String[] args) {
		CompileTime.sum(25, 15, 60);
		CompileTime.sum(75, 45);

	}

}
/*
 * When a method gets to know its implementation at the time of compilation is known as compile
 * time poly this can be achieved by using static method overloading
 */