package day14.inheritances;

//parent class/super class/base class
class country {
	// default constructer
	void display() {
		System.out.println("i am display of country");
	}
}

//child class/subclass
class state extends country {
	// default constructer
	void calling() {
		System.out.println("i am calling of state");
	}
}

public class Example1 {

	public static void main(String[] args) {
		state s1 = new state();
		s1.display();
		s1.calling();

	}

}
/*
 * in order to achieve inheritance we need constructor chaining- constructor
 * chaining- when subclass constructor calls super class constructor and super
 * class constructor calls its super class constructor dn its known as
 * constructor chaining to achieve constructor chaining we need to user super().
 * 
 * super() is used to call parent class constructor based on parameter super()
 * should be the first statement inside the constructor body
 */