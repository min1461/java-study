package day08.quiz_Star;

public class Quiz13 {
	public static void main(String[] args) {
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		System.out.println("Q13.");
		int i = 0;
		int j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 0; i > 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}