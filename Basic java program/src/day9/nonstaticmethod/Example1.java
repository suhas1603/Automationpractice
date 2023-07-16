package day9.nonstaticmethod;

public class Example1 {

	public void display() {
		System.out.println("Hi, I am shailesh");
		System.out.println("You are learning Core-Java");
		System.out.println("My contact number is 9764975157");
	}

	void showDetails(String name, String subject, int num) {
		System.out.println("Hi, I am " + name);
		System.out.println("You are learning " + subject);
		System.out.println("My contact number is " + num);
	}

	void addNumber() {
		int num1 = 20, num2 = 30, res;
		res = num1 + num2;
		System.out.println("Number1 is : " + num1);
		System.out.println("Number1 is : " + num2);
		System.out.println("Result is : " + res);
	}

	void addNumber(int num1, int num2) {
		int res;
		res = num1 + num2;
		System.out.println("Number1 is : " + num1);
		System.out.println("Number1 is : " + num2);
		System.out.println("Result is : " + res);
	}

	public static void main(String[] args) {
		// for calling nonstatic method create an object/instance
		Example1 e1 = new Example1();
		e1.display();
		e1.showDetails("suhas", "maths", 897582377);
		e1.addNumber();
		e1.addNumber(45, 55);
	}

}
