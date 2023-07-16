package day26.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityqueueEx3 {

	public static void main(String[] args) {
		Queue queue=new PriorityQueue();
		queue.add(20);
		queue.add(5);
		queue.add(120);
		System.out.println("size "+queue.size());
		System.out.println("elements : "+queue);
		
		// it will remove top most element of the Queue, if the queue is empty dn it
				// will return 'null' value
		System.out.println("remove topmost using poll : "+queue.poll());
		System.out.println("elements : "+queue);
		// it will remove top most element of the Queue, if the queue is empty dn it
				// will throw an exception by name 'NoSuchElementException'
		System.out.println("removing element from Queue using remove(): " +queue.remove());// 
		System.out.println("Eleements of Queue: " + queue);

	}

}
