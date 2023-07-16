package day16.interface1;

interface Printable1 {
	void print();
}
interface Showable1 {
	void print();
}

public class Interface4 implements Printable1,Showable1 {
	public void print() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Interface4 a1=new Interface4();
		a1.print();
		Showable1 s=new Interface4();
		s.print();
		Printable1 p=new Interface4();
		p.print();

	}

}
