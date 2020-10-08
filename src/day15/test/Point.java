package day15.test;

/*
 * 캡슐화
 * Point클래스 : 좌표 값을 저장하는 기능을 가진 클래스(x,y)
 * 접근 제어자
 *  - 객체의 멤버에 접근을 제어
 *  - ★ private : 클래스 [ 내부 ]에서만 접근이 가능한 멤버 명시
 *  - ★ public : [ 어디서든 ] 접근이 가능한 멤버 명시
 *  - protected : [ 상속 관계 ]에서 직접 접근이 가능한 멤버 명시 (이 외 private과 동일)
 *    (package) : 아무 선언도 하지 않은 멤버. [ 동일한 패키지 ]에서만 직접 접근이 가능
 *    
 *    ★일반적으로 멤버 필드는 private, 멤버 메서드는 public 인 경우가 많음
 *    private 멤버 필드에 대한 접근을 위해서 getter(얻다)/setter(설정하다)메서드 필요
 *    멤버 필드의 이름 시작을 대문자로하고 앞에 set/get을 붙인 이름의 메서드(자바 이름규칙)
 *    
 *    	예시)
 *    	private String name;
 *    
 *    	public void setName(String n) {
 *    		name = n;
 *    	}
 *
 *    	public String getName() {
 *    		return name;
 *    	}
 *    
 */

public class Point {
	// 멤버 필드
	private int x;
	public int y; // public 을 입력하면 다른패키지에서 자유롭게 접근 가능

	// setter, 설정 메서드
	public void setX(int n) {
		x = n;
	}

	// getter,
	public int getX() {
		return x;
	}

	// 멤버 메서드
	public void printPoint() {
		System.out.println("x:" + x + ", y:" + y);
	}
}
