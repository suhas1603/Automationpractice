package day10.constructer;

class C {
	double i;

	C(double j) {
		System.out.println("Running the constructer of class C");
		i = j;
	}
}

public class Cons6 {
	public static void main(String[] args) {
		System.out.println("main() of cons6 started.....");
		C c1 = new C(30.25);
		System.out.println("value of i : " + c1.i);
		c1.i = 45.16; // we reinitialize the nsgv i here
		System.out.println("updated value of i : " + c1.i);
		System.out.println("========================");
		C c2 = new C(55.56);
		System.out.println("new value of i : " + c2.i);
		System.out.println("program ends here");

	}

}
