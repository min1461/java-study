package day04.quiz;

import java.util.Scanner;

//3������ ������ �Է¹޾� �հ�� ����� ���Ͻÿ�.
public class Quiz02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int total = 0;
		double avg = 0.0f;

		System.out.print("�������� �Է�:");
		kor = in.nextInt();
		System.out.print("�������� �Է�:");
		eng = in.nextInt();
		System.out.print("�������� �Է�:");
		mat = in.nextInt();

		total = kor + eng + mat;
		avg = (double) total / 3.0;

		System.out.println("����:" + total + "��");
		System.out.println("���:" + avg + "��");
		
		in.close();
		

	}
}