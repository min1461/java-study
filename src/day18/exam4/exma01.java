package day18.exam4;

/*
 * 오버라이드(Override)
 *  부모 메서드를 자식 메서드가 재정의.
 * 	부모 참조변수는 자식 객체를 참조 할 수 있다.(다형성 시작)
 */

class Parent {
	void methodP() {System.out.println("부모 메서드");
	}
}
class Child extends Parent {
	void methodC() {System.out.println("자식 메서드");
	}
}
public class exma01 {
	public static void main(String[] args) {
		Parent p1 = new Child(); // 업 캐스팅(upcasting)
		p1.methodP();
		// 부모 참조변수는 자식 객체의 멤버를 사용 할 수 없음
		// 자식객체에 오버라이딩된 객체가 호출된다.
		Child c1 = (Child)p1; // 다운 캐스팅(downcasting)
		c1.methodC();
		c1.methodP();
	}
}
