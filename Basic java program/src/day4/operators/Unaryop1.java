package day4.operators;

public class Unaryop1 {
	public static void main(String[] args) {
		int a = 50, b;
		b = a;
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		/*
		 * pre---->First perform the operation then use the updated value post--->First
		 * use the value then perform the operation
		 */
		int k = ++a;// pre increment a=a+1
		System.out.println(" a =" + a);
		System.out.println(" k =" + k);

		int j = k++;// post increment
		System.out.println(" j =" + j);
		System.out.println(" k =" + k);

		int r = -9;
		System.out.println(" r =" + r++);
		System.out.println(" r =" + r);

		System.out.println(" r =" + ++r);
		System.out.println(" r =" + r);

		int x = -9;
		System.out.println(" x =" + --x);// -10
		System.out.println(" x =" + x);// -10
		System.out.println(" x =" + x--);// -10
		System.out.println(" x =" + x);// -11

	}
}
