package day2.interviewprogram;

public class OperatersEx {
	public static void main(String[] args) {
		int a = 25, b = 75;
		boolean res;
		res = (a == b);
		System.out.println("result a=b " + res);
		System.out.println("a!=b :" + (a != b));
		System.out.println("a>b :" + (a > b));
		System.out.println("a<b :" + (a < b));
		System.out.println("==============================");
		//logical AND &&
		System.out.println("A==B && A!=B : "+(a==b && a!=b));
		System.out.println("A<B && A!=B : "+(a<b && a!=b));
		System.out.println("==============================");
		//logical or ||
		System.out.println("A==B || A!=B : "+(a==b || a!=b));
		System.out.println("A>B && A==B : "+(a>b && a==b));
		System.out.println("==============================");
		//logical not !
		System.out.println("A==B || A!=B : "+!(a==b || a!=b));
		
	}

}
