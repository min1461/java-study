package day05.quiz;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		// �ֹ� ���� or
		// 10�� �����϶� ���� ���� orPr
		// 10�� �ʰ��ϋ� ���� ���� or10Pr
		Scanner in = new Scanner(System.in);
		
		int or = 0;
		int orPr = 2500;
		int or10Pr = 2400;
		System.out.print("�ֹ����� : ");
		or = in.nextInt();
		in.close();
		if (or<=10) {
			System.out.print("���� : " + or * orPr);
		} else if (or>10) {
			System.out.print("���� : " + or * or10Pr);
		}
	}
}
