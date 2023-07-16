package day10.constructer;

class B {
	int i=10;   //non static global variable
	B(){
		System.out.println("Running class B constructer.....");
		i=23;  //here we reinitialize i
	}
}

public class Cons7 {
	public static void main(String[] args) {
		System.out.println("main() of cons7 started.....");
		B b1=new B();
		b1.i=88;
		System.out.println("global variable i : "+b1.i);
		System.out.println("=================");
		B b2=new B();
		System.out.println("global variable i : "+b2.i);
	}

}
