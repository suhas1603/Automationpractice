package day26.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityqueueEx {

	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue<Integer>();
		// while adding element in Queue, it will always keep smallest element on the top
		queue.add(123);
		queue.add(245);
		queue.add(10);
		queue.add(105);
		queue.add(50);
		queue.add(1);
		System.out.println("size : "+queue.size());
		System.out.println("elements : "+queue);
		 //element() returns top most element of the queue, if the queue if empty dn it
		 //will throw an exception by name 'NoSuchElementException'
		System.out.println("head element of the queue using element():" + queue.element());
		// peek() returns top most element of the queue, if the queue if empty dn it
		// will return 'null' instead of throwing exception
		System.out.println("head element of the queue using peek():" + queue.peek());
		System.out.println("iterating the queue elements using for-each loop:");
		for(int itr : queue) {
			System.out.println(itr);
		}
		System.out.println("iterating the queue elements using Iterator:");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
