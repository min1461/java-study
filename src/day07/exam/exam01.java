package day07.exam;

import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("입력한 수 만큼 hellojava를 출력하세요 : ");
		int n = in.nextInt();
		int i = 1;
		for (; i <= n; i++) {
			// for문 안에 초기값을 '(int)i' 지정하면 for문이 종료되었을때 값이 없어짐 (지역변수개념)
			System.out.println(i + ". hellojava");
		}
	}
}