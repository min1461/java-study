package day09.quiz;

import java.util.Scanner;
//세과목의 점수를 받아 합계,평균 및 등급을 출력하라(while / do~while문 활용)
public class Quiz01 {
	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);

		int kor = 0;
		int eng = 0;
		int mat = 0;
		int sum = 0;
		double avg = 0.0;

		while (true) {
			System.out.print("국어 점수 : ");
			kor = score.nextInt();
			if (kor <= 100 && kor >= 0) {
				break;
			}
		}
		do {
			System.out.print("영어 점수 : ");
			eng = score.nextInt();
		} while (mat < 0 || mat > 100);
		System.out.print("수학 점수 : ");
		mat = score.nextInt();
		sum = kor + eng + mat;
		avg = sum / 3.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

		switch ((int) avg / 10) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		case 5:
			System.out.println("F등급");
			break;
		}
	}
}