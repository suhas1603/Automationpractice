package day14.inheritances;

class country1 {
	country1(int i) {
		System.out.println("I am int-param cons of Country class");
	}

	void display() {
		System.out.println("I am display method of Country");
	}
}

class state1 extends country1 {
	state1() {
		super(25);
		System.out.println("I am zero-param cons of State class");
	}

	void calling() {
		System.out.println("i am calling of state1");
	}
}

class city1 extends state1 {
	// default constructer
	void testing() {
		System.out.println("i am testing of city1");
	}
}

public class Example2 {

	public static void main(String[] args) {
		city1 s1 = new city1();
		s1.display();
		s1.calling();
		s1.testing();

	}

}/*
in order to achieve inheritance we need constructor chaining-

constructor chaining- when subclass constructor calls super class constructor and 
						super class constructor calls its super class constructor dn its 
						known as constructor chaining
to achieve constructor chaining we need to user super().

super() is used to call parent class constructor based on parameter
super() should be the first statement inside the constructor body
*/
