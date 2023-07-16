package day8.staticmethod;

public class Example2 {
     static int addNumber() {
    	 int num1=10,num2=30,res;
    	 res=num1+num2;
    	 System.out.println("Num1 is "+num1);
    	 System.out.println("Num2 is "+num2);
    	 return res;
     }
     
     static int addTwoNumbers(int num1,int num2) {
    	 int res;
    	 res=num1+num2;
    	 System.out.println("Number1 is "+num1);
    	 System.out.println("Number2 is "+num2);
    	 return res;
     }
     public static void main(String[] args) {
		addNumber();//it will execute method body but you wont be able to see its return value
		System.out.println("*************************************************");
		System.out.println("Return value="+addNumber());
		//it will execute method body also print the return value
		System.out.println("*************************************************");
		int sum=addNumber();
		System.out.println("Result :"+sum);
		
		int cal=sum+160;
		System.out.println("updated :"+cal);
		System.out.println("*************************************************");
		addTwoNumbers(70,30);//wont give return value
		System.out.println("*************************************************");
		System.out.println("return value of two numbers is "+addTwoNumbers(80,20));
		
	}
}
