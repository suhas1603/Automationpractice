package day26.collection;

import java.util.Vector;

public class VectorCapacity {

	public static void main(String[] args) {
		Vector<String> vcTr=new Vector<String>();
		System.out.println("Default vector capacity : "+vcTr.capacity());//10
		System.out.println("vector size : "+vcTr.size());//0
		vcTr.setSize(2);
		System.out.println("vector size : "+vcTr.size());
		System.out.println("Vector elements: "+vcTr);
		//add elements
		vcTr.add("sunday");
		vcTr.add("monday");
		System.out.println("after add,vector size : "+vcTr.size());
		System.out.println("after add,Vector elements: "+vcTr);
		vcTr.addElement("wednesday");
		System.out.println("After addElement, Vector Size: " + vcTr.size());//
		System.out.println("Vector Capacity: " + vcTr.capacity());//

	}

}
