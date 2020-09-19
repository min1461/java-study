package day05.quiz;

import java.util.Scanner;

/*
 * 유원지에서 말을 태워주는데 
 * 처음 30분의 기본요금은 1인당 3000원이다. 
 * 이후에는 10분당 500원씩의 추가 요금을 받는다. 
 * 말을 탄 시간을 입력 받아서 
 * 전체 금액을 계산하는 프로그램을 작성하여라.
 */
public class Quiz09 {
	public static void main(String[] args) {
		// final이 선언된 변수는 상수화된 변수이다.
		final int baseTime = 30;// 30분 기본이용시간
		final int basePrice = 3000;// 3000원 기본이용료
		final int perAddTime = 1;// 10분당 추가요금기준시간
		final int perAddPrice = 50;// 500원 추가이용료
		int useTime = 0;// 이용시간
		int usePrice = 0;// 이용금액

		Scanner in = new Scanner(System.in);
		System.out.print("말 탄 시간:");
		useTime = in.nextInt();
		in.close();
		if (useTime <= baseTime) {
			usePrice = basePrice;
		} else {
			int useAddTime = useTime - baseTime;
			usePrice = useAddTime / perAddTime * perAddPrice;
			usePrice += basePrice;
		}

		System.out.println("이용금액:" + usePrice);
	}
}
