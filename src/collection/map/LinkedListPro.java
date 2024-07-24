package collection.map;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LinkedListPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List <String> li = new LinkedList<String>();
		//Vector<String> li = new Vector<String>();
		Stack<String> li = new Stack<String>();
		li.push("Hello");
		li.push("12");
		li.push("13");
		li.push("Welcome");
		li.push("13");
		
		System.out.println(li);
		
		li.pop();
		System.out.println(li);
		
		System.out.println(li.peek());
		
//		for(String data : li) {
//			System.out.println(data);
//		}
	}

}
