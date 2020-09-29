package day10.Quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int num1 = input.nextInt();
		System.out.print("두번째 수 : ");
		float num2 = input.nextFloat();
		System.out.println("두 수의 합 : " + callIntFloat(num1, num2));
	}

	public static float callIntFloat(int a, float b) {
		float sum = a + b;
		return sum;
	}
}