package day25.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("program starts form here");
		int i, j, k;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first num : ");
		i = scn.nextInt();
		System.out.println("Enter second num :");
		j = scn.nextInt();
		try {
			System.out.println("****You are inside the try block****");
			k = i / j;
			System.out.println("Result : " + k);
			System.out.println("****No exception found****");
		} catch (ArithmeticException obj) {
			System.out.println("*********You are in catch()*********");
			// System.out.println("Exception handled, exception msg "+obj.getMessage());// /
			// by zero
			// System.out.println("Exception handled, exception name and msg
			// "+obj);//java.lang.ArithmeticException: / by zero
			obj.printStackTrace();// complete exception detail
			System.out.println("******Exception Handled*******");

		}

	}

}/*
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/
