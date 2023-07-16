package day14.inheritances;

class z{
	final int a=25;
	static double b=15.99;
	z(){
		System.out.println("cons of z class");
		System.out.println("nsgv : "+a);
	}
	void demo1() {
		System.out.println("demo method of class z");
		System.out.println("sgv : "+b);
	}
}

class y extends z{
	int a=13;
	y(){
		System.out.println("cons of y class");
	}
	void demo2() {
		System.out.println("demo method of class y");
		System.out.println("NSGV : "+a);
		System.out.println("nsgv with super key : "+super.a);
	}
}

class x extends y{
	x(){
		System.out.println("cons of x class");
	}
	void demo() {
		System.out.println("demo method of class x");
	}
}

public class Practice1 {

	public static void main(String[] args) {
		x r1=new x();
		//r1.demo();
		//r1.demo1();
		r1.demo2();

	}

}
