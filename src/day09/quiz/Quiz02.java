package day09.quiz;

import java.util.Scanner;
//팩토리얼
public class Quiz02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fac = 1;

		System.out.print("팩토리얼 입력값 : ");
		int num = in.nextInt();
		int tmp = num;

		while (tmp != 0) {
			fac *= tmp;
			tmp--;
		}
		System.out.println(num + "!= " + fac);
	}
}
