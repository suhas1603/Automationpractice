package day26.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityqueueEx2 {

	public static void main(String[] args) {
		Queue queue=new PriorityQueue();
		System.out.println("size : "+queue.size());
		System.out.println("elements : "+queue);
		
		// peek() returns top most element of the queue, if the queue if empty dn it
				// will return 'null' instead of throwing exception
		System.out.println("head element using peek : "+queue.peek());
		
		// element() returns top most element of the queue, if the queue if empty dn it
				// will throw an exception by name 'NoSuchElementException'
		System.out.println("head element using element : "+queue.element());

	}

}
