// 한줄 주석(comment): 코드에 설명을 달아주는 기능. 실행에 영향을 주지 않음
/*
 * 멀티라인 주석
 * 첫 번째 예제 입니다.
 * HelloJava.java 클래스
 * 화면에 인사 문자열을 출력하는 기능
 */
package day02.exam; // 해당 클래스가 어떤 패키지에 속하는지 선언(첫째줄에 한 번 선언)

//자바는 클래스를 기반으로 작성되는 언어
public class HelloJava { // 파일의 이름과 동일한 문자열을 동일하게 작성
	// main은 자바 프로그램의 시작 지점
	public static void main(String[] args) {
		// JRE(JVM)를 통해서 실행되는 내용
		System.out.println("Hello Java~");
		 /*                      └ 문자열(String) 
		  * System클래스 안에 out객체가 가지는 println()메서드를 호출(사용)
		  * println() : 괄호 안에 선언된 데이터를 콘솔(화면)에 출력 기능(함수,메서드)
		  */
		System.out.println(20);
	}
}
