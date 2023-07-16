package day15.abstraction;
abstract class Shape {
	abstract void draw();
}
// In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {
	@Override
	protected void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle1 extends Shape {
	public void draw() {
		System.out.println("drawing circle");
	}
}
// In real scenario, method is called by programmer or user
public class AbstractClass2 {

	public static void main(String[] args) {
		Shape s=new Rectangle();
		s.draw();
		Shape s1=new Circle1();
		s1.draw();

	}

}
