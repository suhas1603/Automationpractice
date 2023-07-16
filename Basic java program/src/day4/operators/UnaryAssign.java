package day4.operators;

public class UnaryAssign {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a;
//initial-->	0    2      3    3 //b=8
//final----->   1    2      3    3 //a=3

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("========================");

		a = 0;
		b = a-- + --a + --a + a;
//initial--->  0	-2    -3    -3  //b=-8
//final ----> -1	-2    -3    -3  //a=-3

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("========================");

		a = 0;
		b = --a + --a + --a + a + ++a + a++;
//initial----> -1   -2    -3   -3   -2    -2   //b= -13
//final  ----> -1   -2    -3   -3   -2    -1  // a= -1
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("========================");

		a = 0;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
//initial--->  0   -1    0     0     2     2    3  //b=6
//final ----> -1   -1	 0     1     2     3    3  //a=3
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
