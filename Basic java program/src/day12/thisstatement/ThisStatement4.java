package day12.thisstatement;

class student2 {
	int rollno;
	float fee;

	student2(int rollno) {
		this.rollno = rollno;
		System.out.println("Global rollno : " + rollno);
	}

	student2(int rollno, float fee) {
		this(rollno);
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + fee);
	}
}

public class ThisStatement4 {

	public static void main(String[] args) {
		System.out.println("program starts");
		student2 s1 = new student2(22);
		s1.display();
		System.out.println("================");
		student2 s2 = new student2(42, 49950.75f);
		s2.display();

	}

}
