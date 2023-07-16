package day8.staticmethod;

public class MethodOverloading {
	
	public static void calling() {
		System.out.println("zero parameter main");
	
	}
	public static void calling(int a) {
		System.out.println("int parameter main");
	}
	public static void calling(double a, int b) {
		System.out.println("double-int para main");
	}
	public static void main(String[] args) {
		calling();
		calling(12);
		calling(22.0,5);
	}

}
