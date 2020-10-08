package day15.exam;

public class exam03 {
	public static void main(String[] args) {
		Point pos1 = new Point();	// 디폴트 생성자 호출
		Point pos2 = new Point(100);	// Point(int)
		Point pos3 = new Point(100,200);	// Point(int,int)
		
		pos1.printPoint();
		pos2.printPoint();
		pos3.printPoint();
		
//		Point2 test = new Point2(); // 생성 불가
//		// 생성자가 오버로딩 되어 있을 경우 디폴트 생성자는 자동으로 호출되지 못함
		Point2 test1 = new Point2(10);
		Point2 test2 = new Point2(100,200);
	}
}