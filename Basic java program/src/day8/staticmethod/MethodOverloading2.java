package day8.staticmethod;

public class MethodOverloading2 {
	
	 static int addTwoNumbers(int a,int b) {
    	 int res;
    	 res=a+b;
    	 System.out.println("Number1 is "+a);
    	 System.out.println("Number2 is "+b);
    	 return res;
     }
	 static double addTwoNumbers(double b,int a) {
    	 double res;
    	 res=b+a;
    	 System.out.println("Number1 is "+b);
    	 System.out.println("Number2 is "+a);
    	 return res;
     }
	 public static void main(String[] args) {
		System.out.println("Return value is : "+addTwoNumbers(44,22));
		System.out.println("*********************************");
		System.out.println("Return value is : "+addTwoNumbers(45.0,55));
	}
}
