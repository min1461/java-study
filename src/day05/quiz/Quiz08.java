package day05.quiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		// 3�� ����̸鼭 5�� ����� ���(3�� ����� ����)
		Scanner in = new Scanner(System.in);

		System.out.print("�� �Է�:");
		int n = in.nextInt();

		in.close();
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println(n);
		}
	}
}