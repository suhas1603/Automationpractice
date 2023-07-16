package day7.assignment;

public class ForLoop1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(+i + ": Hello everyone,Welcome to Automation");
		}
		System.out.println("====Display num 1 to 5=====");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("====Display alphabet A to Z=====");
		for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			System.out.print(ch1 + " ");
		}
		System.out.println("====Display alphabet a to z=====");
		for(char c1='a';c1<='z';c1++) {
			System.out.println(c1);
		}
	}

}
