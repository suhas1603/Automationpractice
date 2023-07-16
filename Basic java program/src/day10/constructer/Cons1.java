package day10.constructer;

public class Cons1 {
	int age = 25;// non static g v

	void display() { // non static method
		System.out.println("Hi,i am display method");
	}

	public static void main(String[] args) {
		Cons1 c1 = new Cons1();
		// calling default constructer of cureent class written by java compiler
		System.out.println(c1.age);
		c1.display();
	}

}
