package day10.Quiz;

import java.util.Scanner;

/*
 * 메서드 만들기
 입력 받은 수가 홀수인지 짝수인지 반환하는 메서드
 수를 입력 받아 1부터 입력 받은 수 까지 홀수의 합을 반환하는 메서드
 * 
 문자를 입력 받아 대문자 <-> 소문자로 변환하는 메서드
 */

public class Quiz05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("입력한 값 : ");
		String text = in.nextLine();
		try {
			int a = Integer.parseInt(text);
			if (callBy(a)) {
				System.out.println(a + " 는 홀수입니다.");
			} else {
				System.out.println(a + " 는 짝수입니다.");
			}
			System.out.println(callByNum(a));
		} catch (NumberFormatException e) {
			for (int i = 0; i < text.length(); i++) {
				System.out.print(callBy(text.charAt(i)));
			}
		}
	}

	public static int callByNum(int num) {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			if (callBy(i)) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static boolean callBy(int num) {
		if (num % 2 == 0) {
//			System.out.print(num + "는 짝수입니다.");
			return false;
		} else {
//			System.out.print(num + "는 홀수입니다.");
			return true;
		}
	}

	public static String callBy(char str) {
		int tmp = (int) str;
		if (tmp >= 65 && tmp <= 90) {
			tmp += 32;
		} else if (tmp >= 97 && tmp <= 122) {
			tmp -= 32;
		} else {
			String n = "";
			return n;
		}
		
		return Character.toString((char)tmp);
	}
}
