package day06.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "";
		int kor = 0, eng = 0, mat = 0, sum = 0;
		float avg = 0.0f;

		while (true) {
			System.out.println("1. 이름등록 ");
			System.out.println("2. 점수입력 ");
			System.out.println("3. 이름출력 ");
			System.out.println("4. 총점출력 ");
			System.out.println("5. 평균출력 ");
			System.out.print("입력 : ");
			int sel = in.nextInt();
			in.nextLine();
			switch (sel) {
			case 1:
				System.out.print("이름 : ");
				name = in.nextLine();
				break;
			case 2:
				System.out.println("국어 점수 : ");
				kor = in.nextInt();
				System.out.println("영어 점수 : ");
				eng = in.nextInt();
				System.out.println("수학 점수 : ");
				mat = in.nextInt();
				in.nextLine();
				sum = kor + eng + mat;
				avg = sum/3;
				break;
			case 3:
				System.out.println("등록된 이름 : " + name);
				break;
			case 4:
				System.out.println("총점 : " + sum + "점");
				break;
			case 5:
				System.out.println("평균점수 : " + avg + "점");
				break;
			case 6:
				System.out.println("프로그램 종료");
				System.exit(0);// 프로그램을 종료하는 기능
			}
//			break; // - while문의 break 
		}
	}
}
