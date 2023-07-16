package day13.finalkeywordandblocks;

public class Blocks8 {
	int age = 25;
	double salary = 9000.75;

	void display() {
		System.out.println("NSGV age : " + age);
		System.out.println("NSGV salary : " + salary);
	}

	// non static block or IIB
	{
		display();
		age = 30;
		salary = 40000.25;
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		Blocks8 h1 = new Blocks8();
		h1.display();// with help of ref it gives us reinitialize value...
		System.out.println("main() ends....");
	}

}
