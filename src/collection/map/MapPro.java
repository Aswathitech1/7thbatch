package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,String> obj = new TreeMap<String,String>();
		
		obj.put("Aey1","Hello");
		obj.put("Hey2", "Good");
		obj.put("zey3", "abc");
		//obj.put(null, null);
		obj.put("bey4", "Welcome");
		
		System.out.println(obj);
		
		Set mapset = obj.entrySet();
		Iterator iter = mapset.iterator();
		while(iter.hasNext()) {
			Map.Entry entry = (Map.Entry)iter.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		

	}

}
