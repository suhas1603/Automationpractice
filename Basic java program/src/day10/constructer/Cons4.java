package day10.constructer;

public class Cons4 {
	int roll;
	int salary;

	Cons4(int r, int s) {
		roll = r;
		salary = s;
//here we don't use syso so it don't print anything....
	}

	void display() {
		System.out.println(roll + " " + salary);
	}

	public static void main(String[] args) {
		Cons4 d1 = new Cons4(45, 10000);
		d1.display();

	}

}
/*parameterized constructor: 
is used to initialize different values for non-static 
variable at the time of object creation */