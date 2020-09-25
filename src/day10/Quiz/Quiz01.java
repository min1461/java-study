package day10.Quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void bigNum(int a, int b) {
		if (b >= a) {
			int tmp = b;
			b = a;
			a = tmp;
			System.out.println("a값 : " + a + ", b값 : " + b);
			System.out.println("큰값 : " + a);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 값  : ");
		int a = in.nextInt();
		System.out.print("두번째 값  : ");
		int b = in.nextInt();
		bigNum(a,b);
	}
}
