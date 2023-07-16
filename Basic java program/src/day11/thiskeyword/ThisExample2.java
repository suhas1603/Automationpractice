package day11.thiskeyword;

class A {
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		m();
	}
}
public class ThisExample2 {
	void methodOne() {
		System.out.println("Inside Method ONE");
	}
	void methodTwo() {
		System.out.println("Inside Method TWO");
		methodOne();
	}
	public static void main(String[] args) {
		//here for both class we have to create an object
		ThisExample2 obj=new ThisExample2();
		obj.methodTwo();
		A a=new A();
		a.n();
		
	}
}


