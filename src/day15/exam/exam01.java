package day15.exam;

public class exam01 {
	public static void main(String[] args) {
		Point pos1 = null; // 참조변수 생성 및 null초기화
		System.out.println(pos1);
		pos1 = new Point();	// 대입
		System.out.println(pos1);
		System.out.println(pos1.x);
		
		Point pos2 = new Point();	//	초기화
		
		pos1.x = 10;
		pos2.y = 20;
		
		pos2.x = 30;
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
