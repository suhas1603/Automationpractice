package day19.polymorphism;

class Animal {
	void eat() {
		System.out.println("Animals Eat");
	}
}
class herbivores extends Animal {
	void eat() {
		System.out.println("Herbivores Eat Plants");
	}
}
class omnivores extends Animal {
	void eat() {
		System.out.println("Omnivores Eat Plants and meat");
	}
}
class carnivores extends Animal {
	void eat() {
		System.out.println("Carnivores Eat meat");
	}
}

public class Runtime {

	public static void main(String[] args) {
		Animal obj=new herbivores();
		obj.eat();
		Animal obj1=new omnivores();
		obj1.eat();
		Animal obj2=new carnivores();
		obj2.eat();
		Animal obj3=new Animal();
		obj3.eat();

	}

}/*
 * When a method gets to know its implementation at the time of execution/rum time is known as run
 * time poly this can be achieved by using method overriding
 * 1. Inheritance
 * 2. Upcasting
 * 3. Method Overriding
 */