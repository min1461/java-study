package day09.quiz;

import java.util.Scanner;
//거꾸로 출력하기
public class Quiz03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("입력한 값 : ");
		int input = in.nextInt();
		
		System.out.print("거꾸로 출력한 값 : ");
		
		while (input!= 0) {
			System.out.print(input % 10);
			input /= 10;
		}
		System.out.println();
	}

}