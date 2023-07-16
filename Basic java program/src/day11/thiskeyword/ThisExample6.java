package day11.thiskeyword;

public class ThisExample6 {
	// gv
	int rollno;
	float fees;

	ThisExample6(int rollno, float fees) {
		System.out.println("local rollno : " + rollno);
		System.out.println("local fees : " + fees);
		System.out.println("Global rollno : " + this.rollno);
		System.out.println("Global fees : " + this.fees);
		this.rollno = rollno;
		this.fees = fees;
		System.out.println("updated global rollno : " + this.rollno);
		System.out.println("updated global fees : " + this.fees);
	}

	void display() {
		System.out.println(rollno + " " + fees);
	}

	public static void main(String[] args) {
		System.out.println("*************with t1 ref***************");
		ThisExample6 t1 = new ThisExample6(25, 60000.35f);
		t1.display();
		System.out.println("*************with t2 ref***************");
		ThisExample6 t2 = new ThisExample6(112, 7000f);
		t2.display();
	}

}
