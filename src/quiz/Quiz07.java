package quiz;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("ù��° ���� �Է��ϼ���. : ");
		int n1 = in.nextInt();
		System.out.print("ù��° ���� �Է��ϼ���. : ");
		int n2 = in.nextInt();
		int n3 = n1 + n2;
		in.close();
		if (n3 % 2 != 0 && n3 % 3 == 0) {
			System.out.println(n1 + "," + n2);
		}
	}
}
