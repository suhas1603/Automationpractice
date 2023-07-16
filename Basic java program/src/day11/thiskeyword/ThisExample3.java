package day11.thiskeyword;

public class ThisExample3 {
	int age;
	void call() {
		System.out.println(" I am call method");
	}
	void m(int age) {
		System.out.println("local variable age : "+age);
		System.out.println("NSGV age : "+this.age);
		//ThisExample3 m1=new ThisExample3();
		//System.out.println("NSGV age : "+m1.age);
		call();
		System.out.println("this keyword value is: "+this);//ref id
	}
	public static void main(String[] args) {
		ThisExample3 t1=new ThisExample3();
		System.out.println("object obj value is: "+t1);//prints same ref id
		t1.m(35);
	}

}
