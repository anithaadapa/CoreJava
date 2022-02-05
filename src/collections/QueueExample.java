package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>(); // add in random order
		
		pq1.add("Nick ");
		pq1.add("Nickle");
		pq1.add("Nimbu");
		
		System.out.println(pq1); // which element
		
		System.out.println("First element " + pq1.peek()); // element in first place is shown. But in stack it will show last element.
		System.out.println("First element " + pq1.poll()); // gets eliminated from first place
		System.out.println(pq1);
		
		ArrayDeque<String> dq1 = new ArrayDeque<String>(); // maintains the order in which values are inserted

		dq1.add("Nick");  // cannot add null values but can add duplicates
		dq1.add("Nickle");
		dq1.add("Nimbu");
		System.out.println(dq1);
		
		System.out.println(dq1.peek());
		System.out.println(dq1.peekFirst());
		System.out.println(dq1.peekLast());
		
		System.out.println(dq1.poll()); // will remove first element
	//	System.out.println(dq1.pollFirst()); // will remove first element
	//	System.out.println(dq1.pollLast()); // will remove last element
		System.out.println(dq1);
		


	}

}
