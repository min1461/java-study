package quiz;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.print("ù��° ���� ���� : ");
		a = score.nextInt();
		System.out.print("�ι�° ���� ���� : ");
		b = score.nextInt();
		System.out.print("����° ���� ���� : ");
		c = score.nextInt();
		score.close();
		int sum = a + b + c;
		int ever = sum / 3;

		if (ever >= 90) {
			System.out.print("�հ� : " + sum + "��, ��� : " + ever + ", ��� : " + "A");
		} else if (ever < 90 && ever >= 80) {
			System.out.print("�հ� : " + sum + "��, ��� : " + ever + ", ��� : " + "B");
		} else if (ever < 80 && ever >= 70) {
			System.out.print("�հ� : " + sum + "��, ��� : " + ever + ", ��� : " + "C");
		} else if (ever < 70 && ever >= 60) {
			System.out.print("�հ� : " + sum + "��, ��� : " + ever + ", ��� : " + "D");
		} else if (ever < 60) {
			System.out.print("�հ� : " + sum + "��, ��� : " + ever + ", ��� : " + "E");
		}

	}

}