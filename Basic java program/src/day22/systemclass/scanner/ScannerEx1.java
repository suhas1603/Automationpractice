package day22.systemclass.scanner;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num1,num2;
		char ops;
		System.out.println("enter num1");
		num1=scn.nextInt();
		System.out.println("enter num2");
		num2=scn.nextInt();
		System.out.println("enter operation");
		ops=scn.next().charAt(0);
		System.out.println("Addition of two numbers: "+addNumber(ops,num1,num2));

		}
	static int addNumber(char op, int num1, int num2) {
		if (op == '+') {
			return num1 + num2;
		} else {
			return 0;
		}
	}

}
