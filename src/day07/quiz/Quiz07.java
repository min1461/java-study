package day07.quiz;

public class Quiz07 {
	public static void main(String[] args) {

		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
					System.out.printf(" %d * %d = %3d ", i, j, j * i);
			}
			System.out.println();
		}
	}
}
