package day20.exam;

/* 에러 : 프로그램 실행 문제
 * 예외 : 실행중 발생될수 있는 문제점
 * 		자바에서는 예외를 생성하여 프로그램을 종료 시키도록 만들어져 있음
 * 
 * 개발자에게 사용자가 발생 시킬 수 있는 예외적인 사항들을 처리하도록 요구
 * 처리하기 위한 방법
 * 
 * Exception : 컴파일 시 예외 처리 확인
 * RuntimeException : 
 * 
 * try{} : 예외가 발생 될 수 있는 영역
 * catch(예외클래스의 참조){} : try에서 발생된 예외 객체를 참조하여 적절하게 처리하는 블록
 * finally{} : 
 * 	예외 발생 여부와 상관없이 무조건 실행되는 블록 
 *  - 자원해제(입출력 스트림을 해제하는데 활용)
 *  throw : 예외 객체를 던지는 키워드
 *  		던져지는 객체는 반드시 catch를 이용하여 처리되야 함
 *  throws : 해당 메서드에서 발생되는 예외를 나를 호출한 메서드에게 전가
*/
public class ExceptionEx02 {
	public static void main(String[] args) /*throws MyException*/{
		Calculator cal = new Calculator();
		try{
			int ret = cal.div(-10, 3);
			System.out.println(ret);
		}catch(MyRuntimeException e) {
			System.out.println(e.getMessage());
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
