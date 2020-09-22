package day07.quiz;

public class Quiz02 {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			} else if (i % 2 != 0) {
				sum2 += i;
			}
		}
		System.out.println("짝수의합 : " + sum1);
		System.out.print("짝수의합 : " + sum2);
	}
}
