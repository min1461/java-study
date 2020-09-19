package exam;

import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		scan.close();
		if (score > 60) {
			System.out.println("합격입니다");
		}

	}
}
