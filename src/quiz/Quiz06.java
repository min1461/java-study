package quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n1 = 0, n2 = 0;
		System.out.print("첫번째 수를 입력하시오 : ");
		n1 = in.nextInt();
		System.out.print("두번째 수를 입력하시오 : ");
		n2 = in.nextInt();

		in.close();
		if (n1 >= n2) {
			if (n1 % 2 == 0) {
				System.out.println(n1 + "는 짝수이다.");
			}
		} else {
			if (n2 % 2 == 0) {
				System.out.println(n2 + "는 짝수이다.");
			}
		}
	}
}