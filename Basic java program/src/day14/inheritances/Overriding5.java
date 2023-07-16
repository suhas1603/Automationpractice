package day14.inheritances;

//Base Class or parent class or Super class
class Parent {
	void show() {
		System.out.println("Parent's show()");
	}
}
//Inherited class or child class or sub class
class Child extends Parent {
	// This method overrides show() of Parent
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}
public class Overriding5 {

	public static void main(String[] args) {
		// If a Parent type reference refers to a Parent object, then Parent's show is called
		Parent obj1=new Parent();
		obj1.show();
		System.out.println("====================");
		// If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
				// POLYMORPHISM.
		Parent s1=new Child();
		s1.show();//override here
		

	}

}
