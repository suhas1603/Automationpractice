package day4.operators;

public class Relatiop {

	public static void main(String[] args) {
		int num1 = 25, num2 = 50;
		System.out.println("num1 =" + num1);
		System.out.println("num2 =" + num2);
		boolean res = (num1 == num2);
		System.out.println("Num1==Num2 =" + res);
		System.out.println("Num1==Num2 =" + (num1 == num2));

		// Not Equal to
		System.out.println("Num1!=Num2 =" + (num1 != num2));

		// grater than
		System.out.println("Num1>Num2 =" + (num1 > num2));

		// less than
		System.out.println("Num1<Num2 =" + (num1 < num2));

		// grater than equals to
		System.out.println("Num1>=Num2 =" + (num1 >= num2));

		// less than equals to
		System.out.println("Num1<=Num2 =" + (num1 <= num2));

	}

}
