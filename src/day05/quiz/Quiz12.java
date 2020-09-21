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
		float avg = (float) sum / 3;
		char grade = 0;

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'E';
		}
		System.out.print("합계 : " + sum + "평균 : " + avg + "등급 : " + score);

	}

}