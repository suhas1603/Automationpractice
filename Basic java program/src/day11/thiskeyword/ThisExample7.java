package day11.thiskeyword;

public class ThisExample7 {
	int a;
	int b;
	
	//take parameterized constructer
	ThisExample7(int a,int b){
		this.a=a;
		this.b=b;
		}
	void display() {
		//showing the value of variable a and b
		System.out.println("a = "+a  +"b = "+b);
	}
	public static void main(String[] args) {
		ThisExample7 t1=new ThisExample7(10,20);
		t1.display();
		System.out.println(t1.a +" "+ t1.b);
		System.out.println("*********************");
		ThisExample7 t2=new ThisExample7(45,55);
		t2.display();
		System.out.println(t2.a +" "+ t2.b);
	}
	

}
