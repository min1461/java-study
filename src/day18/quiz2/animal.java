package day18.quiz2;

/*
 * 추상클래스/추상메서드
 *  - 추상 메서드를 1개이상 가지는 클래스 (abstract)
 *  
 * 인터페이스(다중상속에 활용)
 *  - 순수한 추상 클래스
 *  - 서로 다른 타입의 관계를 만들어주는 역할
 */
public abstract class animal {
	String type = "";
	animal(String type){
		this.type = type;
	}
	
	abstract public void death();
	public void attack() {
		System.out.println(type+"같이 공격");
	}
	public void cry() {
		System.out.println(type+"같이 울기");
	}
	
	public void sleep() {
		System.out.println(type+"같이 자기");
	}
}
