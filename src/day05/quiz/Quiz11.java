package day05.quiz;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner disk = new Scanner(System.in);
		// 디스켓 갯수
		// 개당 가격
		// 10개이상 가격
		// 100개이상 가격
		int or = 0;
		int pr = 5000;
		int pr10 = (int) (pr * 0.90);
		int pr100 = (int) (pr * 0.88);
		System.out.print("디스크의 개수 : ");
		or = disk.nextInt();
		disk.close();
		if (or < 10) {
			System.out.print("가격 : " + or * pr);
			
		} else if (100 > or && or >= 10) {
			System.out.print("가격 : " + or * pr10);

		} else if (or>=100) {
			System.out.println("가격 : " + or * pr100);
		}
	}

}
