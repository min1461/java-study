package day10.Quiz;

import java.util.Scanner;

public class Quiz10 {
	public static int iNtrue(int num) {
		if (num<=0) return -num;
		else return num;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("입력한 값 : ");
		int num = in.nextInt();
		System.out.print(num+"의 절댓값은 "+iNtrue(num));
	}
}
