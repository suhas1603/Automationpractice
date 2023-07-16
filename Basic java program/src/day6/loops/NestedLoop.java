package day6.loops;

public class NestedLoop {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("hello i: " + i);
			for (int j = 0; j < 2; j++) {
				System.out.println("Hey j: " + j);
			}
		}
		System.out.println("=================================");
		for (int a = 0; a < 3; a++) {
			System.out.println("Hello a: " + a);
			for (int b = 0; b < 2; b++) {
				System.out.println("Hey b: " + b);
				for (int c = 0; c < 2; c++) {
					System.out.println("Bye c: " + c);
				}
			}
		}
		System.out.println("========Infinite loop========");
		for(int i=1;i>=0;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}
