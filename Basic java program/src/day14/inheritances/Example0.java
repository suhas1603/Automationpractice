package day14.inheritances;

class country100 {
	// default constructer
	void display() {
		System.out.println("i am display method of country100");
	}
}

class state100 {
	// default constructer
	void calling() {
		System.out.println("I am calling method of State");
	}
}

public class Example0 {
	void testing() {
		System.out.println("I am testing method of Example0");
	}

	public static void main(String[] args) {
		country100 c1 = new country100();
		c1.display();
		state100 s1 = new state100();
		s1.calling();
		Example0 e1 = new Example0();
		e1.testing();

	}

}/*
	 * in order to achieve inheritance we need constructor chaining-
	 * 
	 * constructor chaining- when subclass constructor calls super class constructor
	 * and super class constructor calls its super class constructor dn its known as
	 * constructor chaining to achieve constructor chaining we need to user super().
	 * 
	 * super() is used to call parent class constructor based on parameter super()
	 * should be the first statement inside the constructor body
	 */
