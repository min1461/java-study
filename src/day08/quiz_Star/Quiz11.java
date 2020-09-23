package day08.quiz_Star;

public class Quiz11 {
	public static void main(String[] args) {
		System.out.println("Q11.");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int p = 0; p < i+1; p++) {
				System.out.print("*");
			}System.out.println("");
		}
	}
}