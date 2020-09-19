package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("산술 연산자를 입력하세요(+,-,*,/,%):");
		char op = in.nextLine().charAt(0);

		String result =
				(op == '+' ||
				 op == '-' ||
			 	 op == '*' ||
				 op == '/' ||
				 op == '%') ? "산술연산자입니다." : "산술연산자가 아닙니다.";
		// 논리연산자
		System.out.println(op+"는"+result);
		in.close();
	}

}
