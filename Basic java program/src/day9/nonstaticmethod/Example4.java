package day9.nonstaticmethod;

public class Example4 {
	//global variables
	double result;
	static double salary;
	
	void addTwoNumbers(double num1, int num2) {
		 result=num1+num2;
		System.out.println("Number1 = "+num1);
		System.out.println("Number2 = "+num2);
		System.out.println("Result = "+result);
	}
	static double totalSalary(int basic, double ta, int hra) {
		salary=basic+ta+hra;
		System.out.println("Basic salary : "+basic);
		System.out.println("TA in  salary : "+ta);
		System.out.println("HRA salary : "+hra);
		return salary;
	}
	public static void main(String[] args) {
		System.out.println("initial salary : "+salary);
		Example4 e1=new Example4();
		System.out.println("Result : "+e1.result);
		e1.addTwoNumbers(44.5,22);
		
		totalSalary(20000,567.5,1000);
		System.out.println(totalSalary(20000,567.5,1000));
	}
	

}
