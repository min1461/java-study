package day08.quiz_Star;

public class Quiz14 {
	public static void main(String[] args) {
/*
 * 		Q14.
 *		*****
 *		 ****
 *		  ***
 *		   **
 *		    *
 *		   **
 *		  ***
 *		 ****
 *		*****
 */
		System.out.println("Q14.");
		int i = 0;
		int j = 0;
		for (i = 0; i < 9; i++) {
			if (i < 5) {
				for (j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (j = 5; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (j = 5; j > i-3; j--) {
					System.out.print(" ");
				}
				for (j = 0; j < i-3; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
