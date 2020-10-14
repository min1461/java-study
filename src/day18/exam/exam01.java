package day18.exam;

/*
 * 상속(extends)
 *  - 클래스를 재사용(확장)
 */

class A {
	int a;

	void methodA() {
		System.out.println(a + " A 기능");
	}

	A() {
		System.out.println("A생성");
	}
}

class B extends A { // A클래스를 재사용하여 B클래스를 정의
	int b;

	void methodB() {
		System.out.println(b + " B 기능");
	}

	B() {
		System.out.println("B생성");
	}
}

class C extends B {
	int c;

	void methodC() {
		System.out.println(c + " C 기능");
	}

	C() {
		System.out.println("C생성");
	}
}

public class exam01 {
	public static void main(String[] args) {
		C obC = new C();
		obC.c = 10;
		obC.methodC();

		obC.a = 20;
		obC.methodA();
	}
}
