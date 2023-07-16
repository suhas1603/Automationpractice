package day19.polymorphism;

class Vehicle {
	// defining a method
	void run() {
		System.out.println("Vehicle is moving");
	}
}

// Creating a child class
class Car2 extends Vehicle {
	// defining the same method as in the parent class
	void run() {
		System.out.println("car is running safely");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.run();

	}

}
