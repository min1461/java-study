package day13.exam;

import java.util.Random;

// 배열을 활용하여 로또 예상번호의 중복 값을 제거하시오.

public class exam01 {
   public static void main(String[] args) {
      Random ran = new Random();
      int[] lotto = new int[6];
      
      for(int i = 0; i < lotto.length; i++) {
         lotto[i] = ran.nextInt(45) + 1;
         System.out.println("뽑은 값:" + lotto[i]);
         for(int j = 0; j < i; j++) {
            System.out.println(lotto[i] + "==" + lotto[j]);
            if(lotto[i] == lotto[j]) {
               System.out.println("중복!");
               i--;
               break;
            }
         }
      }
      
      for(int i = 0; i < lotto.length-1; i++) {
         for(int j = i+1; j < lotto.length; j++) {
            if(lotto[i] > lotto[j]) {
               int tmp = lotto[i];
               lotto[i] = lotto[j];
               lotto[j] = tmp;
            }
         }
      }
      
      for(int i = 0; i < lotto.length; i++) {
         System.out.printf("%2d ", lotto[i]);
      }
      System.out.println();
   }
   
}