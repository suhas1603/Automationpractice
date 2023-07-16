package day11.thiskeyword;

public class ThisExample0 {
	int x = 25, y = 55;

	void calling(int x) {
		System.out.println("i am local variable : " + x);
		System.out.println("non static global variable y : " + y);
		// here for nsgv with same name as local
		// use third keyword or create an object
		ThisExample0 t1 = new ThisExample0();
		System.out.println("non static GV x : " + t1.x);
		// using this keyword
		System.out.println("non static GV x : " + this.x);
		this.x=x;  //NSGV=LV
	}

	public static void main(String[] args) {
		// Above method is non static so here create an object
		ThisExample0 t2 = new ThisExample0();
		t2.calling(75);
		System.out.println("NSGV X : " + t2.x);
		System.out.println("NSGV Y : " + t2.y);
	}

}
