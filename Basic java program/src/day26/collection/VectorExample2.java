package day26.collection;

import java.util.Vector;

public class VectorExample2 {

	public static void main(String[] args) {
		//create vector
		Vector<String> vec=new Vector<String>();
		System.out.println("Elements are: " + vec.capacity());
		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Cat");
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Cat");
		System.out.println("elements of vector : "+vec);
		vec.addElement("mat");
		System.out.println("vector capa"+vec.capacity());
		//transversing through for each loop
		for(String str :vec) {
			System.out.println(str);
		}
		
		//Additional method of vector
		System.out.println("first element of vector: "+vec.firstElement());
		System.out.println("last element of vector : "+vec.lastElement());
		System.out.println("index of lion object : "+vec.lastIndexOf("Lion"));
		

	}

}
