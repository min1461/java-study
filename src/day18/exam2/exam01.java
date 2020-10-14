package day18.exam2;

/*
 * private (개인의)
 * public (모두가 사용가능한)
 * protected (가보)
 */

class A {
	protected int a;
	void methodA() {System.out.println(a + " A 기능");}

	A() {System.out.println("A생성");}
}

class B extends A { // A클래스를 재사용하여 B클래스를 정의
	int b;
	void methodB() {System.out.println(a + " B 기능");}

	B() {System.out.println("B생성");	}
}

class C extends B {
	int c;
	void methodC() {System.out.println(a + " C 기능");}

	C() {System.out.println("C생성");	}
}

public class exam01 {
	public static void main(String[] args) {
		C obC = new C();
		System.out.println("================================");
		obC.c = 10;
		obC.a = 20;
		obC.methodC();
		System.out.println("================================");
		obC.a = 30;
		obC.methodA();
	}
}