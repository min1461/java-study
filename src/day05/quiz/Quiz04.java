package day05.quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("���� �Է��ϼ���.");

		int num = scan.nextInt();
		scan.close();
		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

}
