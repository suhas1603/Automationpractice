package day14.inheritances;

class ABC{
	void mymethod() {
		System.out.println("method of ABC");
	}
}

public class Overriding4 extends ABC{
	public void mymethod() {
		super.mymethod();
		//this will call the method of abc
		System.out.println("overriding method");
	}

	public static void main(String[] args) {
		
		Overriding4 obj=new Overriding4 ();
		obj.mymethod();

	}

}
