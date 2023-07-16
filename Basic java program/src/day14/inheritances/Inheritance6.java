package day14.inheritances;

class Grandfather {
	Grandfather() {
		System.out.println("i am cons of grandfather class");
	}

	void myhome() {
		System.out.println("i am myhome of grandfather");
	}
}

class Father extends Grandfather {
	Father(double d) {
		// super();// if we dont wirte this dn java compiler will write by default
		// super()
		System.out.println("I am Class Father constrctuor...");
	}

	void mycar() {
		System.out.println("i am car of my father");
	}
}

class child1 extends Father {
	child1(int i) {
		super(25.50);
		System.out.println("i am cons of child1");
	}

	void mybike() {
		System.out.println("i am bike of child1");
	}
}

public class Inheritance6 {

	public static void main(String[] args) {
		System.out.println("******************************");
		child1 c1 = new child1(10);// call all cons //access all methods-home,car,bike
		c1.myhome();
		c1.mycar();
		c1.mybike();
		System.out.println("******************************");
		Father f1 = new Father(254.10);
		f1.myhome();
		f1.mycar();
		// or
		Father f2 = new child1(25);// home, car but bike will not be visible/accessible to father
		f2.myhome();
		f2.mycar();
		System.out.println("******************************");
		// creating an object or instance of child most class and referred by its parent
		Grandfather g1 = new child1(155);
		g1.myhome();

	}

}
/*
 * add debug point into the required steps use following keys f6 ----> next
 * line, execute current line and move next file f5 ----> go inside the function
 * f8 ----> continue, to continue the normal execution flow ctrl+shift+f ---->
 * to check the variable value or method return value
 */
/*
 * statements are two type 1. Homogeneous : LHS = RHS 2. Heterogeneous : LHS !=
 * RHS
 * 
 * int age=20; // Homogeneous double salary=25000; //Heterogeneous
 * 
 * A a1 = new A(); A a2 = new B(); A a3 = a1; B b1 = new B(); A a4 = b1;
 */
