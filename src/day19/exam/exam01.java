package day19.exam;

class CustomClass /* extends Object */{ // Object 클래스는 Java의 모든 Class를 상속한다.
	int a;
	CustomClass(int a){ this.a = a;}
	@Override
	public String toString() {
		return "[a="+a+"]";
	}
	
	// 컬렉션을 사용할 때 활용(객체의 동등성/동일성)
	@Override
	public int hashCode() {
		return a; // 객체가 가지는 값을 이용하여 정수값을 생성
	}
	
	// 객체의 깊은 비교를 위해 오버라이딩
	@Override
	public boolean equals(Object o) {
//		System.out.println("?");
//		return (this == o) ? true : false; 
		CustomClass tmp = null;
		if (o instanceof CustomClass) {
			tmp = (CustomClass)o;
		}
		if(this.a == tmp.a) {
			return true;
		}else {
			return false;
		}
	}
}

public class exam01 {
	public static void main(String[] args) {
		CustomClass o = new CustomClass(10);
		CustomClass o2 = o;
		CustomClass o3 = new CustomClass(20); 
		
		System.out.println("참조값 : "+ o);
		System.out.println("참조값 : "+ o3);
		System.out.println("toString() : "+o.toString()); // 객체 멤버의 값을 이용하여 문자열 생성
		System.out.println("toString() : "+o3.toString()); // 객체 멤버의 값을 이용하여 문자열 생성
		System.out.println("o.hashocode() : "+o.hashCode()); // 객체를 식별하기 위한 용도
		System.out.println("o3.hashocode() : "+o3.hashCode());
		System.out.println("o.equals(o2) : "+o.equals(o2)); // 객체의 동일성
		System.out.println("o.equals(o3) : "+o.equals(o3));
		System.out.println("o == o2 : " + (o == o2));
		System.out.println("o == o3 : " + (o == o3));
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = s1;
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}
