package day05.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 연산자의 우선순위(필히 암기해야)
		System.out.println("합격 여부 입력(1 or 2):");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String result = (n == 1) ? "합격입니다." : "불합격입니다.";
		System.out.println(result);
		in.close();
	}

}