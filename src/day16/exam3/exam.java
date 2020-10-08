package day16.exam3;

/*
 * final (마지막, 최종의 ..)
 * 	멤버 필드
 * 		반드시 초기화 해야 하고 변경될 수 없는 값을 명시(상수)
 * 		일반적으로 식별자를 모두 대문자로 사용(합성어는 _사용 ex)HELLO_JAVA)
 * 		코드의 가독성을 높이기 위해 값에 이름을 붙이는 용도
 * 
 *  멤버 메서드
 *  	상속관계에서 오버라이딩(Override)을 할 수 없는 메서드 명시
 *  
 *  클래스
 *  	상속을 할 수 없는 클래스를 명시
 *  
 *  
 *  static + final
 *  	필드 : 클래스가 로딩되면 사용가능 + 상수
 *  	메서드 : 클래스가 로딩되면 사용가능 + 오버라이딩 불가
 *  
 *  추가 예약어>
 *  필드: transient(파일전송)
 *  메서드: 
 *  	abstract(추상화 명시)
 *  	synchronized(Thread 관련 동기화)
 *  	native(타 언어와 연계)
 */


public class exam {
	static final int VALUE = -1;
	
	void method1() {
		//VALUE = 12;	상수이므로 변경 불가
		final int a = 10;
		//a = 30; 상수이므로 변경 불가
	}
}
