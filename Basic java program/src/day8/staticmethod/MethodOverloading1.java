package day8.staticmethod;

public class MethodOverloading1 {
	
	static int addNumber(int a, int b) {
		int res=a+b;
		System.out.println("Number1 is "+a);
		System.out.println("Number2 is "+b);
		return res;
	}  
	static double addnumber(double d, int c) {
		double res=d*c;
		System.out.println("Number1 is "+d);
		System.out.println("Number2 is "+c);
		return res;
	}
	public static void main(String[] args) {
		addNumber(25,75);
		System.out.println("return value ->"+addNumber(25,75));
		System.out.println("***************************************");
		addnumber(25.0,15);
		System.out.println("return ="+addnumber(25.0,15));
	}

}
