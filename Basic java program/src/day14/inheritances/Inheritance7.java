package day14.inheritances;

//parent class
class fruits {
	int fruitAge;// 7 ----declare

	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;// ---- initialize
	}

	public void taste() {
		System.out.println("Fruits are sweet");
	}
}

//child class of fruit
class orange extends fruits {
	int fruitAge;

	orange() {
		// super(); //java compiler will write default super()
		System.out.println("orange class Cons..");
		fruitAge = 5;
	}
    // @override
	public void taste() {
		System.out.println("orange are sweet");
	}

	public void shape() {
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: " + fruitAge);//
		taste();// calling orange class taste method
		fruits f1 = new fruits();
		System.out.println("Fruits class fruitAge variable: " + f1.fruitAge);
		f1.taste();
		System.out.println("Fruits fruitAge: " + super.fruitAge);// 7
		super.taste();// parent class fruit taste method
	}
}

public class Inheritance7 {

	public static void main(String[] args) {
		orange o1 = new orange();
		o1.shape();

	}

}/*
	 * Overriding: When parent class and child class both are having same method dn
	 * that will be known as overriding
	 *  super: is a keyword or instance of super class use to refer super class non-static members mainly used when subclass
	  and super class having common non-static members
	 */
