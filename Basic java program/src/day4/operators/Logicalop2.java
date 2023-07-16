package day4.operators;

public class Logicalop2 {

	public static void main(String[] args) {
		int a = 40, b = 50;// local variable
		boolean res;

		System.out.println("*********Logical AND**********");
		res = (a == b) && (a >= b);
		System.out.println("logical AND =" + res);

		res = (a < b) && (a != b);
		System.out.println("when both condition are true dn res =" + ((a < b) && (a != b)));

		// for Logical AND---->When both condition are true then result is true
		// otherwise false

		System.out.println("*********Logical OR**************");
		// logical OR ---->when both the conditions are false then result is false
		// otherwise true

		res = (a < b) || (a <= b);
		System.out.println("logical or  =" + res);

		res = (a == b) || (a > b);
		System.out.println("when both conditions are false then =" + res);

	}

}
