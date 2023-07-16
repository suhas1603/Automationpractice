package day16.interface1;

//Interface
interface Animal0 {
	int age=20;//by default public static final
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}
//Pig "implements" the Animal interface
class Pig7 implements Animal0 {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

public class Interface6 {

	public static void main(String[] args) {
		Pig7 obj=new Pig7();
		obj.animalSound();
		obj.sleep();
		Animal0 obj1=new Pig7();
		obj1.animalSound();
		obj1.sleep();
		System.out.println(Animal0.age);

	}

}
