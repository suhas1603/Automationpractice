package day7.assignment;

public class SwapNumber {

	public static void main(String[] args) {
		int x = 100, y = 200;

		System.out.println("Before swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

//		int temp = x;//using Third Variable
//		x = y;
//		y = temp; 
		  x=x+y;   //without using Third Variable
		  y=x-y;
		  x=x-y;
		  

		System.out.println("After swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}
   
}
//x=x+y;
//  y=x-y;
//  x=x+y;
//  
  
 