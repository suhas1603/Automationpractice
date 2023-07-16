package day4.operators;

public class Logicalop {

	public static void main(String[] args) {
		int a=55,b=75;
		boolean res1,res2,res3,res4;
		res1=(a==b);//f
		res2=(a!=b);//t
		res3=(a>b);//f
		res4=(a<b);//t
		System.out.println("boo1 && bool2 = "+(res1 && res2));
		System.out.println("boo2 && bool4 = "+((a!=b) && (a<b)));
//declare and initialize res as per above in logical operator
		//or first declare then initialise as the result we want like below one
		
		/*
		int a=55,b=75;
		boolean res;
		res=(a!=b) && (a<b);
		System.out.println("condition1 && condition2 ="+res);
		 */
	}

}
