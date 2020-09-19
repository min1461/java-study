package day05.quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("값을 입력하세요.");

		int num = scan.nextInt();
		scan.close();
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}
