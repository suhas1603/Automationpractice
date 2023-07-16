package day26.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		//add elements
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		
		HashSet<String> set=new HashSet<String>(list);
		System.out.println("initial elements : "+set);
		set.add("Gaurav");
		System.out.println(" elements : "+set);
		//tranversing through iterator
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("******************");
		set.forEach(s1 ->{
			System.out.println(s1);
		});
		System.out.println("***************");
		set.removeIf(s1 ->s1.contains("Ravi"));
		System.out.println("set elements: "+set);

	}

}
