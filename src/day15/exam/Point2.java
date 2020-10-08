package day15.exam;

public class Point2 {
	// 멤버 필드
	int x = -1;
	int y = -2;

	Point2(int n) {
		x = n;
		y = n;
		System.out.println("Point(int) 호출");
	}

	Point2(int n1, int n2) {
		x = n1;
		y = n2;
		System.out.println("Point(int,int) 호출");
	}

	// 멤버 메서드
	void printPoint() {
		System.out.println("x:" + x + ", y:" + y);
	}
}