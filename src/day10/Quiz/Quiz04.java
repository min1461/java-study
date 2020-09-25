package day10.Quiz;

import java.util.Scanner;

/*
 * 메서드 만들기
 입력 받은 수가 홀수인지 짝수인지 반환하는 메서드
 수를 입력 받아 1부터 입력 받은 수 까지 홀수의 합을 반환하는 메서드
 문자를 입력 받아 대문자 <-> 소문자로 변환하는 메서드
 */
public class Quiz04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("입력한 값 : ");
		int text = in.nextInt();
		callBy(text);
		
		char text2 = in.nextLine();
		callBy(text2);
		in.close();
	}
////
////	public static int callBy(int num) {
////		if (num % 2 == 0) {
////			System.out.print("짝수입니다.");
////		} else {
////			System.out.print("홀수입니다.");
////		}
////		return (int) num;
//	}

	public static int callBy(char str) {
		int tmp = (int) str;
		if (tmp >= 65 && tmp <= 90) {
			tmp += 32;
			System.out.print(tmp);
		}else if(tmp >= 97 && tmp <= 122) {
			tmp -= 32;
			System.out.print(tmp);
		}else {
			System.out.println("알파벳이 아닙니다.");
		}

	}

}
