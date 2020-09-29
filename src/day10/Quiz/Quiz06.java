package day10.Quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int num1 = input.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = input.nextInt();
		System.out.println("두 수의 합 : " + callIntInt(num1, num2));
	}

	public static int callIntInt(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
