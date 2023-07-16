package day8.staticmethod;

public class Example4 {

	static void palindrome(int a) {
		int rev = 0, temp;
		temp = a;
		while (a != 0) {
			int remain = a % 10;
			rev = rev * 10 + remain;
			a /= 10;
		}
		if (temp == rev) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("not a palindrome");
		}
	}

	public static void main(String[] args) {
		palindrome(12321);
		palindrome(456543);
	}
}
