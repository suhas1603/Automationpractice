package day22.systemclass.scanner;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		int age;
		double salary;
		String name;
		char grade;
		//create obj of scanner
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter age");
		age=scn.nextInt();
		System.out.println("Age : "+age);
		System.out.println("Enter salary");
		salary=scn.nextDouble();
		System.out.println("salary : "+salary);
		System.out.println("Enter name");
		name=scn.next();
		System.out.println("Name : "+name);
		System.out.println("Enter your Grade: ");
		grade=scn.next().charAt(0);
		System.out.println("Grade : "+grade);
		

	}

}
