package day14.inheritances;

class fourwheeler {
	// default constructer
	public void wheels() {
		System.out.println("i have four wheels...");
	}
}

class car extends fourwheeler {
	// default cons with default super()
	public void type() {
		System.out.println("i am car");
	}
}

class maruti extends car {
	public void company() {
		System.out.println("i am maruti...");
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		maruti m1 = new maruti();
		m1.wheels();
		m1.type();
		m1.company();

	}

}
