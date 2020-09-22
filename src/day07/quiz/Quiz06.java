package day07.quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "번째 수 입력:");
			int n = in.nextInt();
			sum += n;
		}
		System.out.println("평균:" + (sum / 10.0f));
	}
}
