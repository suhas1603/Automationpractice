package day14.inheritances;
class Animal11{
	Animal11(){
		
	}
	public void move() {
		System.out.println("Animals can move");
	}
}
class Dog extends Animal11{
	Dog(){
		//super();
	}
	//@override
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("dogs can bark");
	}
	}
public class Overriding1{
	public static void main(String[] args) {
		//Animal ref and object
		Animal11 a1=new Animal11();
		a1.move();
		System.out.println("==============================");
		//Dog ref and object
		Dog d=new Dog();
		d.move();//override
		d.bark();
		System.out.println("==============================");
		//Animal ref and Dog object
		Animal11 s1=new Dog();
		s1.move();

	}

}
