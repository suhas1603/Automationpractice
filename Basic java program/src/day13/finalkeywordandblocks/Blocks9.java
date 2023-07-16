package day13.finalkeywordandblocks;

public class Blocks9 {
	static int age;

	static void print() {
		System.out.println("Age value form print : " + age);
	}

	static {
		print();
		System.out.println("***Running static block1 of blocks9****");
		age = 25;
	}

	public static void main(String[] args) {
		System.out.println("main() starts...");
		System.out.println("i am main of block9");
		print();
		System.out.println("main ends....");
	}

}
