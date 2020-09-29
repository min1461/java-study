package day12.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0;
		String[] name = new String[] {"국어","영어","수학","총점"};
		int[] score = new int[name.length];
		float avg=0.0f;
		
		for (; i<score.length-1; i++) {
			do {
			System.out.print(name[i]+"의 성적을 입력하시오 : ");
			score[i]=in.nextInt();
			}while(score[i]<0||score[i]>100);
			score[3]=score[0]+score[1]+score[2];
		}
		
		avg = score[3]/(float)(name.length-1);
		System.out.println(name[3]+"는" +score[3]);
		System.out.print("평균값은"+avg+"점입니다.");

	}
}
