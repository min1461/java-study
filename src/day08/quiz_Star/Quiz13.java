package day08.quiz_Star;

public class Quiz13 {
	public static void main(String[] args) {
		System.out.println("Q13.");
		int i = 0;
		int j = 0;
		for (i = 0; i < 9; i++) {
			if (i < 5) {
				//
				for (j = 5; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (j = 0; j <= i - 4; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}