package day05.quiz;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.print("첫번째 과목 성적 : ");
		a = score.nextInt();
		System.out.print("두번째 과목 성적 : ");
		b = score.nextInt();
		System.out.print("세번째 과목 성적 : ");
		c = score.nextInt();
		score.close();
		int sum = a + b + c;
		float ever = (float) sum / 3;

		if (ever >= 90) {
			System.out.print("합계 : " + sum + "점, 평균 : " + ever + ", 등급 : " + "A");
		} else if (ever >= 80) {
			System.out.print("합계 : " + sum + "점, 평균 : " + ever + ", 등급 : " + "B");
		} else if (ever >= 70) {
			System.out.print("합계 : " + sum + "점, 평균 : " + ever + ", 등급 : " + "C");
		} else if (ever >= 60) {
			System.out.print("합계 : " + sum + "점, 평균 : " + ever + ", 등급 : " + "D");
		} else {
			System.out.print("합계 : " + sum + "점, 평균 : " + ever + ", 등급 : " + "E");
		}

	}

}