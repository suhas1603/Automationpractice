package day19.polymorphism;

class Shape {
	public void area() {
		System.out.println("find area");
	}

	public void area(int r) {
		System.out.println("area : " + 3.14 * r * r);
	}

	public void area(double b, double h) {
		System.out.println("area of triangle : " + 0.5 * b * h);
	}

	public void area(int l, int b) {
		System.out.println("area of rectangle : " + l * b);
	}
}

public class Overloading {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.area();
		s1.area(14);
		s1.area(15, 20);
		s1.area(20, 30);

	}

}
