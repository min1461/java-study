package day09.exam;

import java.util.Scanner;

public class exam03 {
   public static void main(String[] args) {
      //flag 기법
      /*
       *     *
       *    ***
       *   *****
       *    ***
       *     *
       */   
      boolean flag = true;
      System.out.print("줄의갯수 : " );
      Scanner num = new Scanner(System.in);
      int line = num.nextInt();
      int star = 1;
      int space = line / 2;
      for(int i = 0; i < line; i++) {
         for(int j = 0; j < space; j++) {
            System.out.print(" ");
         }
         for(int j = 0; j < star; j++) {
            System.out.print("*");
         }
         System.out.println();
         if(i == line/2) 
            flag = !flag;
         if(flag) {
            space--;
            star+=2;
         }else {
            space++;
            star-=2;
         }
      }
   }
}