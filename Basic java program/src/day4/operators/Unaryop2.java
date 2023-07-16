package day4.operators;

public class Unaryop2 {

	public static void main(String[] args) {
		int a = -1, b;
		b = a++ + ++a + ++a + a;
//initial-> -1   1    2    2      ----->b=4
//final--->	 0	 1    2    2      ----->a=2 take final value only for a

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		System.out.println("=================");
		a = 7;
		b = a-- + --a + --a + a;
//ini----> 7   5     4    4 //b=20
//fin----> 6   5     4	  4	//a=4

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		System.out.println("===================");
		a = -21;
		b = --a + --a + --a + a + ++a + a++;
//ini----> -22   -23   -24  -24   -23   -23//b=-139
//fin----> -22   -23   -24  -24   -23   -22//a=-22   

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		System.out.println("===================");
		a = -5;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
//ini---> -5   -6   -5    -5   -3    -3  -2 //b=-29
//fin---> -6   -6   -5	  -4   -3    -2  -2 //a=-2

		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}

}
