package priorityqueue;

import java.util.PriorityQueue;
public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Integer> qu=new PriorityQueue<Integer>(20);		
		qu.offer(20);
		qu.offer(33);
		qu.offer(15);	
		System.out.println(qu.size());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
	}
}
