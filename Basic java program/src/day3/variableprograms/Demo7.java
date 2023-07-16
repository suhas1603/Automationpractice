package day3.variableprograms;

public class Demo7 {
	public static void main(String[] args) {
		double p = 10000;
		int t = 2;
		float r = 7.5f;
		double a = p * (1 + r * t);
		System.out.println("initial principal balance = " + p);
		System.out.println("time in years = " + t);
		System.out.println("Rate of interest = " + r);
		System.out.println("Final amount = " + a);
	}
}
