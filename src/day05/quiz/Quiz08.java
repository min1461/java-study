package day05.quiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		// 3의 배수이면서 5의 배수는 출력(3의 배수는 제외)
		Scanner in = new Scanner(System.in);

		System.out.print("수 입력:");
		int n = in.nextInt();

		in.close();
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println(n);
		}
	}
}