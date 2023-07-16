package day20.array;

public class Array0 {

	public static void main(String[] args) {
		// datatype[] arrayname=new datatype[size]------>syntax
		// String[] cars;
		// cars=new String[4];
		// or
		String[] cars = new String[4];

		cars[0] = "volvo";
		cars[1] = "BMW";
		cars[2] = "ford";
		cars[3] = "Mazda";

		// or
		// String[] cars={"volvo","BMW","ford","Mazda"};
		// access the elements of an array
		System.out.println(cars[0]);// volvo
		// Change an Array Element, re-initialization of array element value
		cars[0] = "opel";
		// array elements count
		System.out.println(cars.length);// 4
		System.out.println("*********Normal for-loop***********");
		// iterate array elements using for loop
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("**************for-each loop*******************");
		// iterate array elements using for-each loop
		for (String i : cars) {
			System.out.println(i);
		}

	}

}
