package day22.systemclass.scanner;

class Training {
	Training() {
		System.out.println("Training class const");
	}

	void manualTesting() {
		System.out.println("I am from manual Testing");
	}

	void automationTesting() {
		System.out.println("I am from Automation Testing");
	}
}

public class Systemclass2 {

	static Training s1 = new Training();

	public static void main(String[] args) {
		System.out.println("program starts");
		Systemclass2.s1.manualTesting();
		Systemclass2.s1.automationTesting();
		// classname.staticRefVar.method
		Training t = new Training();
		t.manualTesting();
		t.automationTesting();
		System.out.println("program ends");

	}

}
