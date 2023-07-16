package day25.exceptionhandling;

public class ExceptionHandling6 {

	public static void main(String[] args) {
		System.out.println("program starts form here");
		try {
			//below code do not throw any exception
			int data=25/0;
			System.out.println("data : "+data);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled...");
		}
		
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("end");

	}

}
/*
exception found but not handled ----> finally executed
exception found and handled ----> finally executed
exception not found but still ----> finally executed

*/