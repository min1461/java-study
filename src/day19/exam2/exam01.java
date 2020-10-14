package day19.exam2;

class MyClass{
	int a = 10;
	/* Object클래스 안의 equals의 값을 재정의! */
	public boolean equals(Object o) {
		MyClass tmp = (MyClass)o;
		return (tmp.a == this.a) ? true : false;
	}
}

public class exam01 {
	public static void main(String[] args) {
		MyClass ob1 = new MyClass();
		MyClass ob2 = new MyClass();
		
		System.out.println(ob1==ob2);
		System.out.println(ob1.equals(ob2));
	}
}