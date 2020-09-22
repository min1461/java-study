package day07.quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("두수의 합을 구하세요.");
		System.out.print("첫번째 수 : ");
		int n1 = in.nextInt();
		System.out.print("두번째 수 : ");
		int n2 = in.nextInt();
		int sum = 0;

		if (n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		for (int i = n1 + 1; i < n2; i++) {
			sum += i;
		}
		System.out.println(n1 + " ~ " + n2 + " = " + sum);
	}
}