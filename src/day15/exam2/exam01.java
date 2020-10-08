package day15.exam2;

import day15.test.Point;	// 다른 패키지의 클래스를 명시
							// Point의 패키지 주소(day15.test.Point)를 명시해도됨
							//  └이런식으로 하면 매번 작성해 주어야해서 번거로움

public class exam01 {
	public static void main(String[] args) {
		Point pos1 = null; // 참조변수 생성 및 null초기화
		System.out.println(pos1);
		pos1 = new Point();	// 대입
		System.out.println(pos1);
		System.out.println(pos1.getX()/*pos1.x*/);
		
		Point pos2 = new Point();	//	초기화
		
		pos1.setX(10);	//pos1.x = 10;
		pos1.y = 20;
		
		pos2.setX(30);	//pos2.x = 30;
		pos2.y = 40;
		
		System.out.println("pos1.printPoint()");
		pos1.printPoint();

		System.out.println("pos2.printPoint()");
		pos2.printPoint();
		
		System.out.println("-------------------");
		
		//pos2 = null; 또는
		pos2 = pos1;
		
		System.out.println("pos1.printPoint()");
		pos1.printPoint();

		System.out.println("pos1.printPoint()");
		pos2.printPoint();
	}
}
