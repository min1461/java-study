package day02.exam;
// 데이터 타입(자료형)
// 정수, 실수(소수점),문자(문자도 정수)

// 자바의 기본 자료형
// 논리형 : boolean(1)
// 정수형 : byte(1), short(2), int(4), long(8)
// 실수형 : float(4), double(8)
// 문자형 : char(사실상정수형)(2)
// 클래스형 : String(문자열)

// 변수(변하는값)와 상수(고정된값)
// 프로그램이 동작될 때 필요한 값이 메모리에 저장
// 값을 저장하기 위해 메모리에 공간이 필요

// 프로그램 작성 시 값을 저장하고자 한다면 변수/상수를 만들어야 함.
// 변수를 만드는 방법
//	자료형	변수명;		=> 변수 선언!(쓰레기 값을 채움)
//	자료형	변수명 = 값;	=> 변수 선언 및 초기화(초기값으로 채움)

public class Ex01 {
	public static void main(String[] args) {
		// 나이를 출력하고자 한다면?
		System.out.println(30);
		
		// 변수를 이용
		int	age;
		age = 30; // 대입연산자(=) - 오른쪽 값을 왼쪽으로 대입함
		System.out.println(age);
		
		// 초기화 (변수 생성 시 최초의 값을 지정하는 것)
		// (0을 만드는게 아니라 초기의 어떤 값으로 만드는 것)
		int age2 = -1;
		System.out.println(age2);
		age2 = 100;
		System.out.println(age2);
		
	}

}
