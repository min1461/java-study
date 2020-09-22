package day07.exam;

import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("입력한 수 만큼 hellojava를 출력하세요 : ");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(i + 1 + ". hellojava");
		}
	}
}