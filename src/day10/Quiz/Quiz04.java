package day10.Quiz;

import java.util.Scanner;

// n1부터 n2값 더하기
public class Quiz04 {
	static Scanner in = new Scanner(System.in);

	public static int nToSum(int n1, int n2) {
		int sum = 0;
		if (n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		while (true) {
			System.out.print("n1의 값 : ");
			n1 = in.nextInt();
			System.out.print("n2의 값 : ");
			n2 = in.nextInt();
			if (n1 == 0 || n2 == 0) {
				System.out.println("0이 아닌 숫자를 입력받으시오.");
				continue;
			}
			System.out.println(nToSum(n1, n2));
		}
	}
}