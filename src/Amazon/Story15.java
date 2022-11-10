package Amazon;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Story15 {

	public static void main(String[] args) {
		
		TreeMap map=new TreeMap();
		map.put("one", "1");
		map.put("two", "2");
		map.put("zero", "0");
		map.put("five", "5");
		System.out.println(map);
		Collection c=map.entrySet();
		System.out.println(c);
		SortedMap x=(SortedMap)map;
		System.out.println(x.firstKey());
		
		
		
		/*Map map=new HashMap();
		map.put("Ravi", "123456");
		map.put("sam", "456789");
		map.put("Rohit", "123456");
		map.put("Virat", "78945");
		map.put("Biswa", "753156");
		System.out.println(map);*/
		
	}

}
