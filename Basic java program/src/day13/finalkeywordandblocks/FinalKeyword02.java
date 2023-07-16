package day13.finalkeywordandblocks;

public class FinalKeyword02 {
	final static int age=10;
	final int empId=123,accNum;
	FinalKeyword02(){
		accNum=24875946;
	}

	public static void main(String[] args) {
		final double salary;
		salary=45750;
		System.out.println("salary : "+salary);
		System.out.println("Age : "+age);
		FinalKeyword02 f1=new FinalKeyword02();
		System.out.println("EmpId : "+f1.empId);
		System.out.println("AccNum : "+f1.accNum);

	}

}
/*
final global variable(static/non-static) has be initialize at time of declaration only.
otherwise you will get compile time error

NOTE: non-static member are loaded into the memory at time of object creation 
hence final non-static global variable can be initialize from constructor as well  
*/