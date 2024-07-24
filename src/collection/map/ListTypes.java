package collection.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();
		//ArrayList list = new ArrayList();
		
		//insert elements
		list.add("Hello");
		list.add(12);
		list.add("Good");
		list.add(12);
		
		//System.out.println(list);
		
		for(int i =0; i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		
		List <String> list1 = new ArrayList<String>();
		
		list1.add("Java");
		list1.add("2");
		
		//System.out.println(list1);
		
		//list1.addAll(list);
		
		//System.out.println(list1);
		
//		list.remove(2);
//		System.out.println(list);
//		
//		
//		for(String data : list1) {
//			System.out.println(data);
//		}
		
		Iterator itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
