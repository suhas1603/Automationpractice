package day26.collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistEx0 {

	public static void main(String[] args) {
		List list = new ArrayList();// Creating arraylist - default size is 10
		list.add("Mango");
		list.add(1234);
		list.add("Banana");
		list.add(null);
		list.add('c');
		list.add(34.56);
		list.add(true);
		list.add(new ArraylistEx0());
		list.add("Banana");// duplicate
		// printing the arraylist object
		System.out.println("size : " + list.size());
		System.out.println("Elements of list are : " + list);
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Traversing list through for-each loop:");
		// Traversing list through for-each loop
		for (Object fruit : list) {
			System.out.println(fruit);
		}
		System.out.println("before update, Elements of list: " + list);
		// accessing the elements
		System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
																// from 0
		// changing/update existing object
		list.set(1, "Dates");
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);

	}

}
