package day08.quiz_Star;

public class Quiz18 {
	public static void main(String[] args) {
		System.out.println("Q18.");
		for (int j = 0; j < 5; j++) {
			for (int k = 4; k > j; k--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * j + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int j = 9; j > 2 * i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}