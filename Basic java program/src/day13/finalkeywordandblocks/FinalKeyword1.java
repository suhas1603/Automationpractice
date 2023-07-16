package day13.finalkeywordandblocks;

public class FinalKeyword1 {
	final int empId = 102;
	double salary = 20000;

	void run() {
		System.out.println("empId : " + empId);
	}

	public static void main(String[] args) {
		FinalKeyword1 f1 = new FinalKeyword1();
		f1.run();
		System.out.println("salary : " + f1.salary);

	}

}
//any global declared as final should be initialize at the same time
//but in case non-static global variable, you initialize its value using constructor or non-static block