package day16.exam;


/* 
 * this
 * 클래스 내의 모든 멤버 메서드에 0번째 매개변수이다.(클래스 this 형태)
 * static 선언된 메서드에는 존재하지 않음
 * 어떤 객체가 멤버 메서드를 호출했는지 참조하는 변수
 * this() 객체 생성시 다른 생성자를 호출할 수 있도록 해줌.
 * 
 * 용도
 * 매개변수(지역변수)의 이름과 멤버필드의 이름이 중복되는 경우 멤버를 명시
 * 
 * this() 용도
 * 생성자가 오버로딩이 되어 있을 때 다른 생성자의 기능을 활용하고 싶을때
 * 생성자의 가장 첫 줄에만 사용 가능
 */
public class exam01 {
	   public static void main(String[] args) {
		      Point pos1 = new Point();
		      Point pos2 = new Point(/*pos2,*/10, 20);
		      Point pos3 = new Point(20, 30);
		      
		      //객체는 몇 개? 3개
		      //x, y 멤버 필드는 몇 쌍?: 3쌍
		      //printPoint() 메서드는 몇 개?: 1개
		      
		      pos1.printPoint();//=> 0,0
		      pos2.printPoint();//=> 10,20?
		      pos3.printPoint();//=> 20,30?
		      
		      pos3.setX(100);
		      pos3.setY(200);
		      pos3.printPoint();//=> 100,200?
		   }
		}