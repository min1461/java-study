package quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n1 = 0, n2 = 0;
		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
		n1 = in.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
		n2 = in.nextInt();

		in.close();
		if (n1 >= n2) {
			if (n1 % 2 == 0) {
				System.out.println(n1 + "�� ¦���̴�.");
			}
		} else {
			if (n2 % 2 == 0) {
				System.out.println(n2 + "�� ¦���̴�.");
			}
		}
	}
}