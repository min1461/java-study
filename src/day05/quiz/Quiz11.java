package day05.quiz;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner disk = new Scanner(System.in);
		// ���� ����
		// ���� ����
		// 10���̻� ����
		// 100���̻� ����
		int or = 0;
		int pr = 5000;
		int pr10 = (int) (pr * 0.90);
		int pr100 = (int) (pr * 0.88);
		System.out.print("��ũ�� ���� : ");
		or = disk.nextInt();
		disk.close();
		if (or < 10) {
			System.out.print("���� : " + or * pr);
			
		} else if (100 > or && or >= 10) {
			System.out.print("���� : " + or * pr10);

		} else if (or>=100) {
			System.out.println("���� : " + or * pr100);
		}
	}

}
