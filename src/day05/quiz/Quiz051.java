package day05.quiz;

import java.util.Scanner;

public class Quiz051 {
	public static void main(String[] args) {
		// 세 수를 입력받아 큰 순서대로 출력

		Scanner in = new Scanner(System.in);

		int n1 = 0, n2 = 0, n3 = 0;
		System.out.print("첫 번째 수 입력:");
		n1 = in.nextInt();
		System.out.print("두 번째 수 입력:");
		n2 = in.nextInt();
		System.out.print("세 번째 수 입력:");
		n3 = in.nextInt();
		in.close();

		if (n2 >= n1 && n2 >= n3) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		} else if (n3 >= n1 && n3 >= n2) {
			int tmp = n1;
			n1 = n3;
			n3 = tmp;
		}
		if (n3 >= n2) {
			int tmp = n2;
			n2 = n3;
			n3 = tmp;
		}
		System.out.println(n1 + ">" + n2 + ">" + n3);
	}
}
