package day10.constructer;

public class Cons21 {

	int age;
	double salary;

	Cons21() {
		System.out.println("**********User Defined Zero-Param Constructor, start from here****************");
		age = 25;
		salary = 32506.56;
		System.out.println("**********User Defined Zero-Param Constructor, ends here****************");
	}

	public static void main(String[] args) {
		Cons21 ref1 = new Cons21();
		System.out.println(ref1.age);
		System.out.println(ref1.salary);
		ref1.age = 55; // reinitialize
		System.out.println("updated age with ref1 : " + ref1.age);
		System.out.println("***********************");
		// again create a object
		Cons21 ref2 = new Cons21();
		System.out.println(ref2.age);
		System.out.println(ref2.salary);
	}
}