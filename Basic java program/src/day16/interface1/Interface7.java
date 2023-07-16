package day16.interface1;
//Interface
interface Animal12 {
	int age=20;//by default public static final
	public void animalSound(); // interface method (does not have a body)
	public void sleep(int i); // interface method (does not have a body)
}
//Interface
interface Reptile {
	public void color(); // interface method (does not have a body)
}
//Pig "implements" the Animal interface
class Pig12 implements Animal12{
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep(int k) {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}
class Dog12 extends Pig12 implements Reptile {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The dog says: bhow bhow");
	}
	public void color() {
		System.out.println("Color: blue");
	}
}

public class Interface7 {

	public static void main(String[] args) {
		Dog12 d=new Dog12();
		d.animalSound();
		d.sleep(12);
		d.color();
		Pig12 p1=new Pig12();
		p1.animalSound();
		p1.sleep(10);

	}

}
