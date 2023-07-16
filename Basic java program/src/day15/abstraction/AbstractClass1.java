package day15.abstraction;

abstract class Bike1 {
	abstract void run();

	void speed(int spd) {
		System.out.println("Bike speed: " + spd);
	}
}

class Honda4 extends Bike1 {
	@Override
	void run() {
		System.out.println("running safely");
	}

	@Override
	void speed(int spd) {
		System.out.println("Honda4 speed: " + spd);
		super.speed(120);
	}

	void color() {
		System.out.println("Honda1 color is blue");
	}
}

public class AbstractClass1 {

	public static void main(String[] args) {
		Honda4 h1 = new Honda4();
		h1.run();
		h1.speed(100);
		h1.color();
		//
		Bike1 b1 = new Honda4();
		b1.run();
		b1.speed(75);

	}

}
