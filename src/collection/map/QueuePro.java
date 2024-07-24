package collection.map;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueuePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PriorityQueue<String> li = new PriorityQueue<String>();
		ArrayDeque<String> li = new ArrayDeque<>();
		li.add("Hello");
		li.add("Good");
		li.add("abc");
		li.add("Welcome");
		
		System.out.println(li);
		
		li.addFirst("112");
		
		li.addLast("By");
		System.out.println(li);
		System.out.println();
		
		for(String data : li) {
			System.out.println(data);
		}
		
		li.poll();
		System.out.println(li);
		
		System.out.println(li.peekLast());
		
		li.pollFirst();
		System.out.println(li);
		
		li.pollLast();
		System.out.println(li);
	}

}
