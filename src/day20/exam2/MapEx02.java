package day20.exam2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MapEx02 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put(1, "hello");
		hm.put('a', new Random());

		Object k1 = hm.get(1);
		System.out.println(k1.toString());
		
		Object k2 = hm.get('a');
		System.out.println(k2.toString());
		
		Set keys = hm.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			Object o = hm.get(1);
			System.out.println(o.toString());
			
			System.out.println(hm.get(o));
		}
	}
}
