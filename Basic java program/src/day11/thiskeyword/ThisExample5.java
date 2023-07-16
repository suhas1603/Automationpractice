package day11.thiskeyword;

public class ThisExample5 {
	int variable = 95;

	void method(int variable) {
		System.out.println("Value of Local variable :" + variable);//
		variable = 80;
		System.out.println("Value of Local variable :" + variable);//
		System.out.println("Value of Instance variable :" + this.variable);//
		this.variable = variable;
		System.out.println("Value of Local variable :" + variable);//
		System.out.println("Value of Instance variable :" + this.variable);//
	}

	void method() {
		int variable = 25;
		System.out.println("Value of Instance variable :" + this.variable);//
		System.out.println("Value of Local variable :" + variable);//
		this.variable = variable;
		System.out.println("Value of Local variable :" + variable);//
		System.out.println("Value of Instance variable :" + this.variable);//
	}

	public static void main(String[] args) {
		ThisExample5 t1 = new ThisExample5();
		t1.method(77);
		t1.method();
		System.out.println("NSGV variable : " + t1.variable);

	}

}
