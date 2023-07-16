package day6.loops;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * for(initialization;condition;incre/decre){} statement to be executed
		 */
		System.out.println("*********using for loop********");
		for (int i = 0; i < 5; i++) {
			System.out.println("i :" + i + " hello everyone,good morning");
		}
		System.out.println("*********Printing 0 to 10 numbers********");
		for (int a = 0; a < 11; a++) {
			System.out.println(a);
		}
		System.out.println("*********Printing reverse 10 to 0 numbers********");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("*********Printing a to z char********");
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.println(c1);
		}
		System.out.println("*********Printing z to a char********");
		for (char ch1 = 'z'; ch1 >= 'a'; ch1--) {
			System.out.println(ch1);
		}
		System.out.println("*********Printing z to a char********");
		for(char c1='z';c1>='a';c1--) {
			int asciivalue=c1;
			System.out.println(c1+":"+asciivalue);
		}
	}

}
