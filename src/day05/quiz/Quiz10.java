package day05.quiz;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		// 주문 갯수 or
		// 10개 이하일때 개당 가격 orPr
		// 10개 초과일떄 개당 가격 or10Pr
		Scanner in = new Scanner(System.in);
		
		int or = 0;
		int orPr = 2500;
		int or10Pr = 2400;
		System.out.print("주문갯수 : ");
		or = in.nextInt();
		in.close();
		if (or<=10) {
			System.out.print("가격 : " + or * orPr);
		} else if (or>10) {
			System.out.print("가격 : " + or * or10Pr);
		}
	}
}
