package day08.quiz_Star;

public class Quiz07 {
	public static void main(String[] args) {
		/*
		 * 56789
		 * 45678
		 * 34567
		 * 23456
		 * 12345
		 */
		System.out.println("Q7.");
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j + i);
			}
			System.out.println();
		}
	}
}