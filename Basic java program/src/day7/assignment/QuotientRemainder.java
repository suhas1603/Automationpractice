package day7.assignment;

public class QuotientRemainder {
	public static void main(String[] args) {
		int a = 27;
		int b = 5;
		int res = a / b;
		System.out.println("num1 a = " + a);
		System.out.println("num2 b = " + b);
		System.out.println("After division quotient = " + res);// here complete number divide by complete number

		System.out.println("======for Reaminder======");
		a = 37;
		b = 6;
		res = a % b;
		System.out.println("num1 a = " + a);
		System.out.println("num2 b = " + b);
		System.out.println("After mod Remainder = " + res);
	}
}
