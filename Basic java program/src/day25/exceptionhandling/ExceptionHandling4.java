package day25.exceptionhandling;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;//
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs "+e);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs "+e);
		} catch (Exception e) {
			System.out.println("Parent Exception occurs "+e);
		}
		System.out.println("========================================");
		try {
			int a[] = new int[5];
			a[5] = 30 / 2;//
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs "+e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs "+e);
		} catch (Exception e) {
			System.out.println("Parent Exception occurs "+e);
		}
		System.out.println("rest of the code");

	}

}
