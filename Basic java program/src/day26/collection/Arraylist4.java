package day26.collection;

import java.util.ArrayList;

public class Arraylist4 {

	public static void main(String[] args) {
		// ArrayList l1=new ArrayList();
//		ArrayList<Integer> l1 = new ArrayList<Integer>();//Generic
//		l1.add(12);
//		ArrayList<Boolean> l2 = new ArrayList<Boolean>();//Generic
//		l2.add(true);
//		ArrayList<Character> l3 = new ArrayList<Character>();//Generic
//		l3.add('a');

		// using Generic way
		ArrayList<String> a1 = new ArrayList<String>();// generic
		a1.add("Ravi");
		a1.add("Vijay");
		a1.add("Ajay");
		a1.add("Anuj");
		a1.add("Gaurav");
		System.out.println("initial elements : " + a1);
		// Removing specific element from arraylist
		System.out.println("remove Vijay from collection: " + a1.remove("Vijay"));
		System.out.println("After invoking remove(object) method: " + a1);
		// Removing element on the basis of specific position
		System.out.println("remove index 0 from collection: " + a1.remove(0));
		System.out.println("After invoking remove(index) method: " + a1);
		System.out.println("***********************************************");
		// Creating another arraylist
				ArrayList<String> al2 = new ArrayList<String>();
				al2.add("Ravi");
				al2.add("Hanumat");
				// Adding new elements to arraylist
				a1.addAll(al2);
				System.out.println("Updated list : " + a1);
				// Removing all the new elements from arraylist
				a1.removeAll(al2);
				System.out.println("After invoking removeAll() method: " + a1);
				// Removing elements on the basis of specified condition
//				if(al.contains("Ajay")) {
//					al.remove("Ajay");
//				}
						//or
				a1.removeIf(str -> str.contains("Ajay")); // Here, we are using Lambda expression
				System.out.println("After invoking removeIf() method: " + a1);
				// Removing all the elements available in the list
				a1.clear();
				System.out.println("After invoking clear() method: " + a1);

	}

}
