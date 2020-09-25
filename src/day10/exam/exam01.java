package day10.exam;

/* 변수 - 필드
 * 함수 - 메서드
 * 메서드란 ? 	자주 사용할 코드(기능)들을 미리 정의해 두는 것.
 * 			필요할 때 Call(호출)해서 결과 반환 값을 활용.
 * 메서드 호출 전달하는 값을 인자(argument)라고 함.
 * 메서드에서 인자를 저장하는 변수를 매개변수(parameter)라고 함.
 */

public class exam01 {
	public static void hjp() {
		System.out.println("Hello Java~");
	}
	public static void hi() {
		System.out.println("안녕 자바~");
	}
	public static void main(String[] args) {
		hjp();
		hi();
	}
}