package day6.loops;

public class ForLoop3 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello" + i);
		}
		System.out.println("**********print odd number form 1 to 100");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println("odd num is  " + i);// if(!(i%2==0))
			}
		}
		System.out.println("**********print Even number form 1 to 100");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number is : " + i);
			}
		}
	}

}
