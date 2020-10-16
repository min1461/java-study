package day20.exam2;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx01 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(10);	// (auto boxing)
		hs.add("hello");
		hs.add(3.14);
		hs.add(10);
		
		Iterator it = hs.iterator();	// 반복자
		while(it.hasNext()/*다음요소가있는가?*/) {
			Object o = it.next(); // 현재요소 반환하고 다음 요소로 이동
			System.out.println(o.toString());
		}
	}
}
