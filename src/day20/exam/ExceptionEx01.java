package day20.exam;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 에러 : 프로그램 실행 문제
 * 예외 : 실행중 발생될수 있는 문제점
 * 		자바에서는 예외를 생성하여 프로그램을 종료 시키도록 만들어져 있음
 * 
 * 개발자에게 사용자가 발생 시킬 수 있는 예외적인 사항들을 처리하도록 요구
 * 처리하기 위한 방법
 * try{} : 예외가 발생 될 수 있는 영역
 * catch(예외클래스의 참조){} : try에서 발생된 예외 객체를 참조하여 적절하게 처리하는 블록
 * finally{} : 
 * 	예외 발생 여부와 상관없이 무조건 실행되는 블록 
 *  - 자원해제(입출력 스트림을 해제하는데 활용)
*/
public class ExceptionEx01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ret = 0, n1 = 0, n2 = 0;
		
		try{
			System.out.print("수 입력 : ");
			n1 = in.nextInt();
				// throw new InputMismatchException();
			System.out.print("수 입력 : ");
			n2 = in.nextInt();
				// throw new InputMismatchException();
			ret = n1 / n2;		
		}catch(InputMismatchException e) {
			System.out.println("입력오류!");
			//e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없음");
//			e.printStackTrace();
//			System.out.print(e.getMessage());
		}finally {
			System.out.println("무조건 실행되는 영역");
		}
		
		System.out.println(ret);
	}
}
