package day22.systemclass.scanner;

class Demo {
	void display() {
		System.out.println("Demo class display method");
	}
	void callMe(int num) {
		System.out.println("Demo class callMe method");//
	}
	Demo() {
		System.out.println("Demo class cons..");
	}
}

public class StaticRef {

	static Demo d2 = new Demo();
	static int age=25;
	public static void main(String[] args) {
		// access Demo class non-static member
//		Demo d1 = new Demo();
//		d1.display();
//		d1.callMe(123);		
		
		//classname.staticref.method
		System.out.println(StaticRef.age);
		//classname.staticref.method
		StaticRef.d2.callMe(123);
		StaticRef.d2.display();
		
		System.err.println("I am error msg");
		

	}

}
