package day10.constructer;

class A {
	int x = 10;

	A() {
		System.out.println("i am constructer of class A");
	}

	void display() {
		System.out.println(" i am display() of class A");
	}
}

class X {
	int j = 25;

	X() {
		System.out.println("i am constructer of class X");
	}

	void display() {
		System.out.println(" i am display() of class X");
	}
}

public class Cons5 {
	void display() {
		System.out.println("i am display() of class Cons5");

	}

	public static void main(String[] args) {
		System.out.println("starts form here");
		// for non static method of class A, create an object
		A a1 = new A();// here it will execute the constructer A()
		a1.display(); // here it will execute method body of class A
		System.out.println("value of global variable x : " + a1.x);
		System.out.println("*******************************************");
		X x1 = new X(); // calling the constructer of class x
		x1.display(); // calling display method of class X
		System.out.println("value of global variable j : " + x1.j);
		System.out.println("*******************************************");
		Cons5 c1 = new Cons5();
		c1.display();
		System.out.println("program ends here");

	}
}
