package day20.exam2;

import java.util.ArrayList;

public class ExList {
	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<String>();

		ls.add("홍길동");
		ls.add("강감찬");
		ls.add("김두한");
		ls.add("이완용");
		ls.add("유관순");
		ls.add("이규철");
		
		for(int i=0; i  < ls.size(); i++) {
			System.out.println(ls.get(i));
		}
		System.out.println("================================");
		ls.add(1,"바보");
		ls.remove(3);
		
		//foreach문이라고 불리는 형태의 for문 : 요소가 있는 만큼 반복
		for(Object o : ls) {
			System.out.println(o);
		}
	}
}
