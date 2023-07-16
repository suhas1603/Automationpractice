package day16.interface1;

interface Printable2 {
	void print();

}
interface Showable2 extends Printable2 {
	void show();
	//public abstract void print(); ---> inherited method/virtual method
}

public class Interface5 implements Showable2{
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		Interface5 obj=new Interface5();
		obj.print();
		obj.show();
		Printable2 obj1=new Interface5();
		obj1.print();
		//obj1.show()
		

	}

}
