package day16.exam3;

class A{
	/*final*/void method() {
		System.out.println("A");
	}
}
class B extends A{
	void method() {	//재정의 할 수 없음
		System.out.println("B-A");
	}
	void methodB() {
		System.out.println("B");
	}
}

public class exam02 {
	public static void main(String[] args) {
		A obA = new A();
		obA.method();
		
		B obB = new B();
		obB.method();
		obB.methodB();
	}
}
