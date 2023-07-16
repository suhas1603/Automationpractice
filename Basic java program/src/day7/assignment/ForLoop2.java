package day7.assignment;

public class ForLoop2 {

	public static void main(String[] args) {

		System.out.println("*******count number of digits in an integer************");

		int count = 0, num = 123456;
		/*
		 * to count digits conditions are---- num!=0 (num>0) and num=num/10 or num/=10
		 */

		for (; num != 0; num /= 10, ++count) {
		}
		System.out.println("The number of digits are :" + count);
		

	}

}
