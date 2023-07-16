package day8.staticmethod;

public class Example3 {
	
	static void reverseNum(int a) {
		int rev=0;
		for(;a!=0;a/=10) {
			int remainder=a%10;
			rev=rev*10+remainder;
		}
		System.out.println("Reverse number is "+rev);
	}
		static void revNum(int i) {
			int rev=0;
			while(i!=0) {
				int remain=i%10;
				rev=rev*10+remain;
				i/=10;
				}
			System.out.println("reverse is ---->"+rev);
		}
	
   public static void main(String[] args) {
	reverseNum(2345);
	revNum(123456789);
}
}
