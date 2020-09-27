package day08.quiz_Star;

public class Quiz15 {
	public static void main(String[] args) {
		System.out.println("Q15.");
		int i = 0;
		int j = 0;
		for (i = 0; i < 9; i++) {
			if (i < 5) {
				for (j = 3; j >= i; j--) {
					System.out.print(" ");
				}
				for (j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (j = 4; j < i; j++) {
					System.out.print(" ");
				}
				for (j = 4; j > i-5; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
