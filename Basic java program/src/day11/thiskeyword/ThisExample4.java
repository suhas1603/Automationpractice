package day11.thiskeyword;

public class ThisExample4 {
	int variable=10;
	int age=5;  //NSGV
	
	void method(int variable) {
		System.out.println("value of variable : "+variable);//local pass in parameter
		System.out.println("GV value of variable : "+this.variable);//NSGV
		this.variable=variable;
		System.out.println("value of variable : "+variable);
		System.out.println("GV value of variable : "+this.variable);
		}
	void call() {
		int variable=40;
		System.out.println("value of variable : "+variable);
	}
	public static void main(String[] args) {
		System.out.println("program starts");
		ThisExample4 e1=new ThisExample4();
		e1.method(20);
		e1.call();
		System.out.println("NSGV variable : "+e1.variable);
		System.out.println("NSGV age : "+e1.age);
	}

}
