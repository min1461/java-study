package day04.quiz;

import java.io.IOException;
import java.util.Scanner;

//자신의 이니셜(String/char)을 입력 받아 출력하시오.
public class Quiz01 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		// System.in.read()를 이용
		System.out.print("첫 번째 이니셜:");
		int in1 = (char) System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("두 번째 이니셜:");
		int in2 = (char) System.in.read();
		scan.nextLine();
		System.out.print("세 번째 이니셜:");
		int in3 = (char) System.in.read();
		System.out.println();
		System.out.println();
		System.out.println(in1 + "." + in2 + "." + in3);

		// char를 이용
//      System.out.print("첫 번째 이니셜:");
//      char in1 = scan.nextLine().charAt(0);
//      System.out.print("두 번째 이니셜:");
//      char in2 = scan.nextLine().charAt(0);
//      System.out.print("세 번째 이니셜:");
//      char in3 = scan.nextLine().charAt(0);

//      System.out.println(in1 + "." + in2 + "." + in3);

		// String을 이용
		/*
		 * System.out.print("이니셜 입력:");
		 * 
		 * String init = scan.nextLine();
		 * 
		 * System.out.println("입력한 이니셜:" + init);
		 */
		scan.close();
	}
}