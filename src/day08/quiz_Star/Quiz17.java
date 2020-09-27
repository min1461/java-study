package day08.quiz_Star;

public class Quiz17 {
	public static void main(String[] args) {
		System.out.println("Q17.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int j = 9; j > 2 * i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}