package day7.assignment;

public class ForLoop4Palindrome {

	public static void main(String[] args) {
		
		int num = 121, reverse = 0,  temp;
		temp=num;
		for (; num != 0; num /= 10) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
		}
        if(temp==reverse) {
        	System.out.println("the number is palindrome");
        }
        else {
        	System.out.println("it is not palindrome");
        }
	}

}
