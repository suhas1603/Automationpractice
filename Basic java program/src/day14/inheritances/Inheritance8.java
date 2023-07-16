package day14.inheritances;

//parent class
class FruitA {
	int fruitage;

	FruitA() {
		System.out.println("fruit A class cons...");
		fruitage = 7;
	}

	public void taste() {
		System.out.println("fruits are sweets");
	}
}

class mango extends FruitA {
	int fruitage;

	mango() {
		// super();
		System.out.println("mango class cons...");
	}

	// @override
	public void taste() {
		System.out.println("mango are tart in taste");
	}

	public void shape() {
		System.out.println("mangoes are round");
	}
}

public class Inheritance8 {

	public static void main(String[] args) {
		mango m1 = new mango();
		m1.taste();
		m1.shape();
		System.out.println("fruitage : " + m1.fruitage);
		System.out.println("===============================");
		FruitA f1 = new FruitA();
		f1.taste();
		System.out.println("fruitage : " + f1.fruitage);
		System.out.println("===============================");
		FruitA f2 = new mango();
		f2.taste();// overriding only happens in case of method
		System.out.println("fruitage = " + f2.fruitage);// due to ref of fruitA

	}

}
