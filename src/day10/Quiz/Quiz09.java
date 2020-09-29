package day10.Quiz;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		float num1 = input.nextFloat();
		System.out.print("두번째 수 : ");
		int num2 = input.nextInt();
		System.out.println("두 수의 합 : " + callFloatInt(num1, num2));
	}

	public static float callFloatInt(float a, int b) {
		float sum = a + b;
		return sum;
	}
}