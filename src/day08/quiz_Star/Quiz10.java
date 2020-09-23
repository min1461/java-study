package day08.quiz_Star;

public class Quiz10 {
	public static void main(String[] args) {
		System.out.println("Q10.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
//		int space = 0;
//		int star = 5;
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < space; j++) {
//				System.out.print(" ");
//			}
//			space++;
//			for (int j = 0; j < star; j++) {
//				System.out.print("*");
//			}
//			star--;
//			System.out.println();
//		}
	}
}