package day08.quiz_Star;

public class Quiz09 {
	public static void main(String[] args) {
		System.out.println("Q9.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}