package day13.quiz;

import java.util.Scanner;

public class Quiz02 {
	   public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      System.out.print("몇 행의 배열을 만드시겠습니까? : ");
	      int size1 = Integer.parseInt(in.nextLine());
	      int[][] arr1 = new int[size1][];

	      System.out.println("각 행에 배열을 만드세요!");
	      //배열 생성
	      for(int i = 0; i < arr1.length/*size1*/; i++) {
	         System.out.print(i+1+"번째 행의 배열 길이:");
	         int size2 = Integer.parseInt(in.nextLine());
	         arr1[i] = new int[size2];
	      }
	      
	      //값 입력
	      for(int i = 0; i < arr1.length; i++) {
	         for(int j = 0; j < arr1[i].length; j++) {
	            arr1[i][j] = j;
	         }
	      }
	      
	      //값 출력
	      for(int i = 0; i < arr1.length; i++) {
	         for(int j = 0; j < arr1[i].length; j++) {
	            System.out.print(arr1[i][j] + " ");
	         }
	         System.out.println();
	      }
	   }
	}