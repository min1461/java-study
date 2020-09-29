package day12.exam;

import java.util.Scanner;

public class exam02	 {
   public static void main(String[] args) {
      //정적할당: 컴파일 타임에 필요한 메모리 영역이 정해지는 것
      //동적할당: 실행 중에 필요한 메모리 영역을 확보하는 것
      Scanner in = new Scanner(System.in);
      System.out.print("길이 입력:");
      int length = in.nextInt();
      int[] arr = new int[length];
      for(int i = 0; i < arr.length; i++) {
         arr[i] = i+1;
      }
      for(int i = 0; i < arr.length; i++) {
         System.out.println("arr[" + i + "]:" + arr[i]);
      }
      
   }
}








