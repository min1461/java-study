package quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� : ");
		int num = scan.nextInt();
		scan.close();
		if(num % 3 ==0) {
			System.out.println(num);
		}
	}
}
