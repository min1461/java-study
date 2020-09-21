package day06.quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int score = 0;
		int grade = 0;
		String a;

		System.out.print("받은점수 : ");
		score = in.nextInt();
		grade = score / 5;

		switch (grade) {
		case 20:
		case 19:
			a = "A+";
			break;
		case 18:
			a = "A";
			break;
		case 17:
			a = "B+";
			break;
		case 16:
			a = "B";
			break;
		case 15:
			a = "C+";
			break;
		case 14:
			a = "C";
			break;
		case 13:
			a = "D+";
			break;
		case 12:
			a = "D";
			break;
		default:
			a = "F";
			break;
		}
		System.out.println("등급 : " + a);
	}
}
