package day20.array;

public class Array1 {

	public static void main(String[] args) {
		/*
		//declaration
		int a[];
		//size initialization
		a = new int[5];
		*/
		//or
		int[] a=new int[5];//declaration and instantiation
		System.out.println(a[0]);  
		System.out.println(a[1]);  
		System.out.println(a[2]);  
		System.out.println(a[3]);  
		System.out.println(a[4]); 
		System.out.println("******************");
		//intialization
		a[0]=10;
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;
		System.out.println("********After initialization***********");
		System.out.println(a[0]);  
		System.out.println(a[1]);  
		System.out.println(a[2]);  
		System.out.println(a[3]);  
		System.out.println(a[4]); 
		System.out.println("******************");
		//array length count
		System.out.println(a.length);
		System.out.println("*********Normal for-loop***********");
		for(int i=0;i<a.length;i++)//length is the property of array  
		{
			System.out.println(a[i]);
		}
		System.out.println("*********for-each loop***********");
		/*
		 * LHS should be same as RHS(array) type in form of datatype or class
		 * for(LHS : RHS){
		 * 
		 * }
		 */
		for(int i : a) {
			System.out.println(i);
		}
		
		char[] getarray=new char[] {'A','B','C'};
		System.out.println("*********for-each loop***********");
		for(char num :getarray) {
			System.out.println(num);
		}
		
		

	}

}
