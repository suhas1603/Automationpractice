package day13.finalkeywordandblocks;

public class Blocks7 {
	final static int age;
	final double salary;
	// static initialization block or SIB
	static {
		age = 28;
	}
	// Non static initialization block
	{
		salary = 79999.99;
	}

	public static void main(String[] args) {
		System.out.println("main() method starts...");
		System.out.println("final static age : " + age);
		Blocks7 b1 = new Blocks7();
		System.out.println("salary : " + b1.salary);
		System.out.println("main() ends....");

	}

}
