package day2.interviewprogram;

public class MethodMix {
	
	int age=25;
	double salary;
	
	MethodMix(){
		this(55);
		System.out.println("Running the constructer");
		salary=49999.99;
		System.out.println("salary : "+salary);
}
	MethodMix(int b){
		System.out.println("running the paramterized constructer");
		System.out.println("here local variable b : "+b);
		
	}
	
	static void display() {
		System.out.println("i am display static method");
		//print 1 to 60 odd number
		for(int i=1;i<=60;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
	static void  display(int a) {
		System.out.println("local variable : "+a);
		if(a>0) {
			System.out.println("it is positive number");
		}else {
			System.out.println("it is negative number");
		}
	}
	void calling() {
		System.out.println("iam non static calling method");
		System.out.println("Age : "+this.age);
		}
	public static void main(String[] args) {
		display();
		display(5);
		display(-10);
		MethodMix m1=new MethodMix();
		m1.calling();
		MethodMix m2=new MethodMix(55);
	}

}
