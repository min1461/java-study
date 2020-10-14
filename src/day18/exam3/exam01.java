package day18.exam3;

/*
 * private (개인의)
 * public (모두가 사용가능한)
 * protected (가보)
 */

class A {	//부모클래스/상위클래스/슈퍼클래스/베이스
	protected int a;
	void methodA() {System.out.println(a + " A 기능");}

	A(int a) {System.out.println("A생성");}
}
// 자식클래스/하위클래스/파생클래스
class B extends A { // A클래스를 재사용하여 B클래스를 정의
	int b;
	void methodB() {System.out.println(a + " B 기능");}

	B() {/*(this처럼) super(); / 부모의 디폴트 생성자 호출 */
		super(10); // 부모 생성자를 선택하는 키워드
		System.out.println("B생성");	}
}

public class exam01 {
	public static void main(String[] args) {
		B obB = new B();
	}
}