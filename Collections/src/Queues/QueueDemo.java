package Queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> myq = new PriorityQueue<>();
		for(int i=0 ; i<100; i += 15)
		{
			myq.offer(i);
		}
		System.out.println(myq);
		int qsize = myq.size();
//		System.out.println(myq.poll());
//		System.out.println(myq);
//		System.out.println(myq.remove());
//		System.out.println(myq);
		
		for(int i= 0;i<qsize;i++)
		{
			System.out.println(myq.poll());
		}
		
	}
}
