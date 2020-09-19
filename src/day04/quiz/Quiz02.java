package day04.quiz;

import java.util.Scanner;

//3과목의 성적을 입력받아 합계와 평균을 구하시오.
public class Quiz02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int total = 0;
		double avg = 0.0f;

		System.out.print("국어점수 입력:");
		kor = in.nextInt();
		System.out.print("영어점수 입력:");
		eng = in.nextInt();
		System.out.print("수학점수 입력:");
		mat = in.nextInt();

		total = kor + eng + mat;
		avg = (double) total / 3.0;

		System.out.println("총점:" + total + "점");
		System.out.println("평균:" + avg + "점");
		
		in.close();
		

	}
}