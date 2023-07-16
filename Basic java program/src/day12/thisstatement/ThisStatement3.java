package day12.thisstatement;

class student1 {
	int rollno;
	float fees;

	student1(int rollno) {
		this.rollno = rollno;
	}

	student1(int rollno, float fees) {
		this(rollno); // reusing constructer with statement
		this.fees = fees;
	}

	void display() {
		System.out.println(rollno + " " + fees);
	}
}

public class ThisStatement3 {

	public static void main(String[] args) {
		System.out.println("****************creating s1 object***********");
		student1 s1 = new student1(110);
		System.out.println(s1.rollno + " " + s1.fees);
		System.out.println("****************creating s2 object***********");
		student1 s2 = new student1(220, 6000.35f);
		System.out.println(s2.rollno + " " + s2.fees);
		System.out.println("=====================");
		s1.display();
		s2.display();

	}

}/*
 * One constructor calls another constructor of the class called Constructor
 * Chaining
 */
