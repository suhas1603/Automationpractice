package day14.inheritances;

//parent class
class vehicle {
	public void wheels() {
		System.out.println("I have wheels");
	}
}
//first child class of vehicle class
class bike extends vehicle {
	public void countwl() {
		System.out.println("I am a bike and has 2 wheels");
	}
}
//second child class of vehicle class
class Car1 extends vehicle {
	public void countwlc() {
		System.out.println("I am a car and has 4 wheels");
	}
}
//third child class of vehicle class
class scooter extends vehicle {	
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}

public class Inheritance4 {

	public static void main(String[] args) {
		bike b=new bike();
		b.wheels();
		b.countwl();
		Car1 c1=new Car1();
		c1.countwlc();
		c1.wheels();
		scooter s1=new scooter();
		s1.wheels();
		s1.countwls();

	}

}
