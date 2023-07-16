package day11.thiskeyword;

public class NonStaticGlobalVariable {
	int age = 35;

	void display() {
		System.out.println("Age form display : " + age);
	}

	void calling(int age) {
		System.out.println("Age form calling : " + age);
		// to print global variable
	//	NonStaticGlobalVariable n1 = new NonStaticGlobalVariable();
	//	System.out.println("Age using ref var : " + n1.age);
		// or
		System.out.println("age global var,using this keyword " + this.age);
	}

	public static void main(String[] args) {
		NonStaticGlobalVariable n2 = new NonStaticGlobalVariable();
		n2.calling(77);
		n2.display();
	}

}
/*
 * this keyword: is an instance of current class 
 * 				used to differentiate local and non-static global variable when they same name
 * 				it should used only inside non-static method / constructor
 */