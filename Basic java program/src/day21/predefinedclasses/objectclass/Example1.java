package day21.predefinedclasses.objectclass;

class Demo{
	void display() {
		System.out.println("I am display()..");
	}
}

public class Example1 extends Demo {
	
	static int last_roll = 100;
	int roll_no;
	// Constructor
	Example1()
    {
        roll_no = last_roll;
        last_roll++;
    }

	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(d1);
		Demo d3=new Demo();
		System.out.println(d3.toString());
		System.out.println("*************************************");
		Example1 e1=new Example1();
		// Below two statements are equivalent
		System.out.println(e1);//java complier writes-->s.toString()
		System.out.println(e1.toString());//string representation of an object
		System.out.println("*************************************");
		Demo d2=new Example1();
		System.out.println(d2);
		System.out.println("***********************************");
		System.out.println(new Example1());

	}

}
