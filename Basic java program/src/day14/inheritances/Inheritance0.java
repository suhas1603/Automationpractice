package day14.inheritances;

class A {
	static int a = 10;
	int b = 20;
	double c = 13.45;
}
class B {
	static int x = 30;
	int y = 40;
	double z = 53.45;
}
class C {
	static int p = 50;
	int q = 60;
	double r = 66.45;
}

public class Inheritance0 {

	public static void main(String[] args) {
		//to access static variable we have to use class name here;
		System.out.println("static var of class A : "+A.a);
		System.out.println("static var of class B : "+B.x);
		System.out.println("static var of class C : "+C.p);
		System.out.println("=============================");
		//to access non static variable we have to create an object
		//for class A
		A a1=new A();
		System.out.println("non static var of class A-b : "+a1.b);
		System.out.println("non static var of class A-c : "+a1.c);
		//for classB
		B b1=new B();
		System.out.println("non static var of class B-y : "+b1.y);
		System.out.println("non static var of class B-z : "+b1.z);
		//for class C
		C c1 = new C();
		System.out.println("non static var of class C-q : "+c1.q);
		System.out.println("non static var of class C-r : "+c1.r);
	}

}
