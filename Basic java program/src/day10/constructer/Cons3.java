package day10.constructer;

public class Cons3 {
	int age;
	double salary;
	/*below is the default constructer, that 
	 * will be written by java compiler at compile time 
	 *
	  Cons3(){
		//Empty body
	} */
	
	public static void main(String[] args) {
		//due to nsgv create object
		Cons3 e1= new Cons3();
		System.out.println(e1.age);
		System.out.println(e1.salary);
	}

}
