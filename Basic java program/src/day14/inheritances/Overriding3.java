package day14.inheritances;

class Human{
	void eat() {
		System.out.println("Human is eating");
	}
}
class Boy extends Human{
	//overriding method
	void eat() {
		System.out.println("Boy is eating");
		super.eat();
	}
}

public class Overriding3 {

	public static void main(String[] args) {
		Human h1=new Boy();
		h1.eat();
		

	}

}
