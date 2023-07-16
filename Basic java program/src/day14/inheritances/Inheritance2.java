package day14.inheritances;
//parent class
class fruit{
	fruit(){
		System.out.println("fruit class cons");
	}
	public void taste() {
		System.out.println("friuts are sweet");
	}
	}
//child class
class apple extends fruit{
	apple(){
		//super(); //java compiler will write default super()
		System.out.println("apple class cons");
	}
	public void shape() {
		System.out.println("apple is round");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		apple a=new apple();
		a.taste();
		a.shape();

	}

}
