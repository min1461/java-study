package day08.quiz_Star;

public class Quiz12 {
	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		System.out.println("Q12.");
		int i=0;
		int j=0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}if (i==5) {
			for (i = 0; i < 5; i++) {
				for (j = 4; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();	
			}
		}
	}
}