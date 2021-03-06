package day15.exam;

/* 
 * 캡슐화
 * Point클래스 : 좌표 값을 저장하는 기능을 가진 클래스(x,y)
 * 클래스 : 객체를 정의한 것
 * 객체 : 클래스로부터 생성되어진 실체
 * new : 클래스를 이용해서 객체(Instance)를 메모리에 생성(인스턴스화)
 * 
 * 객체를 초기화 하는 방법 3가지
 * 객체를 초기화 하기 위한 코드는 클래스에 작성
 * 1. 직접 초기화 - (int x = 값;)
 * 2. 블록 초기화 - ({x = 값; y = 값;} : 멤버 필드 초기화에 로직이 필요한 경우
 * 3. 생성자 초기화(제일 많이 사용함) - 인자가없는 생성자
 * 
 * 생성자
 * 	- 클래스의 이름과 동일한 이름을 가지는 멤버 메서드
 *  - 객체를 생성할 때 반드시 호출되어야 하는 메서드 (new Point();)
 *  - 생성자가 하나도 정의되어 있지 않을 경우 디폴트 생성자가 자동 호출됨
 *  				디폴트 생성자 : 인자가 없는 생성자
 *  - 오버로딩이 가능 ( 객체를 생성할 때 초기값을 전달하여 지정할 수 있다)
 *  	객체를 생성할 수 있는 방법을 다양하게 제공할 수 있다.
 */

public class Point {
	// 멤버 필드
	// 직접 초기화
	int x = -1;
	int y = -2;

	{ // 블록초기화 (ex)멤버 필드의 값이 동적일 경우!)
		x = 10;
		for (int i = 0; i < 10; i++) {
			y += i + 1;
		}
	}

	// 디폴트 생성자 정의
	Point() {
		System.out.println("Point() 호출");
	}

	Point(int n) {
		x = n;
		y = n;
		System.out.println("Point(int) 호출");
	}

	Point(int n1, int n2) {
		x = n1;
		y = n2;
		System.out.println("Point(int,int) 호출");
	}

	// 멤버 메서드
	void printPoint() {
		System.out.println("x:" + x + ", y:" + y);
	}
}