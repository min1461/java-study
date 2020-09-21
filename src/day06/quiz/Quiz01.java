package day06.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int a = in.nextInt();
		in.nextLine();
		System.out.print("연산자 입력 : ");
		char b = in.nextLine().charAt(0);
		System.out.print("두번째 수 입력 : ");
		int c = in.nextInt();
		int sum = 0;
		
		switch (b) {
		case '+':
			sum = a + c;
			break;
		case '-':
			sum = a - c;
			break;
		case '*':
			sum = a * c;
			break;
		case '/':
			sum = a / c;
			break;
		default:
			System.out.println("wrong");
			break;
		}

		System.out.println("결과: " + sum + '=' + a + b + c);
	}
}
