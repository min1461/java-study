package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// �������� �켱����(���� �ϱ��ؾ�)
		System.out.println("�հ� ���� �Է�(1 or 2):");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String result = (n == 1) ? "�հ��Դϴ�." : "���հ��Դϴ�.";
		System.out.println(result);
		in.close();
	}

}