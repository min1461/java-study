package day08.quiz_Star;

public class Quiz21 {
	public static void main(String[] args) {
		System.out.println("Q21.");
		int i = 0;
		for (i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 9; j >= 2 * i + 1; j--) {
				System.out.print("*");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (i = 0; i < 4; i++) {
			for (int j = 5; j >= i + 2; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i + 2; j++) {
				System.out.print("*");
			}
			for (int j = 5; j >= i + 2; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
