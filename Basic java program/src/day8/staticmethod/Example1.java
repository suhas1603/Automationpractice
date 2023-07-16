package day8.staticmethod;

public class Example1 {

	public static void display() {
		System.out.println("Hi,I am suhas ");
		System.out.println("you are learning core java");
		System.out.println("My contact number is 8975823787");
	}
	
	static void showdetails(String name,char grade, int num) {
		System.out.println("Hi, i am "+name);
		System.out.println("your grade is "+grade);
		System.out.println("My contact number is "+num);
	}
	
	static void addnumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Num1 is "+num1);
		System.out.println("Num2 is "+num2);
	}
	
	static void addTwoNumbers(int num1,int num2) {
		int res;
		res=num1+num2;
		
		System.out.println("Number1 is "+num1);
		System.out.println("Number2 is "+num2);
	}
	public static void main(String[] args) {
		display();
		Example1.display();//standred to access----> classname.methodname
		//while calling the parameterize method pass the value based on datatype
		showdetails("sumit",'A', 897584562);
		Example1.showdetails("chetan",'B', 90114221);//standred way
		addnumber();
		addTwoNumbers(45,55);
		Example1.addTwoNumbers(56, 44);
	}
}
