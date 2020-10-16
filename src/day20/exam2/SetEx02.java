package day20.exam2;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx02 {
	public static void main(String[] args) {
		HashSet</*자료형이름*/> hs = new HashSet</*자료형이름*/>();
		// 일반화문법(Generic) : 컬렉션에 저장될 자료형을 명시하는 것
		
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
