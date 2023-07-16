package day26.collection;

import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		// create vector
		Vector<String> vec = new Vector<String>();
		// default capacity is 10, its capacity gets increase by 100% of its size
		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		// Adding elements using addElement() method of Vector
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");
		System.out.println("vector elements : "+vec);
		for(String s1 :vec) {
			System.out.println(s1);
		}

	}

}
/*
Synchronized --> Thread Safe ----> slow
default capacity-->10 --> increases capacity by 100%
Vector comes from JDK 1.0 ---> also known as legacy class
*/