package day11.exam;

import java.util.Random;

//배열: 동일한 자료형으로 메모리에 연속으로 할당된 변수
public class exam03 {
   public static int lottoNum(int scope, int start) {
      Random random = new Random();
      return random.nextInt(scope) + start;
   }
   public static void main(String[] args) {
      int lo1 = 0, lo2 = 0, lo3 = 0, lo4 = 0, lo5 = 0, lo6 = 0;
      lo1 = lottoNum(45, 1);
      do {
         lo2 = lottoNum(45, 1);
      }while(lo1 == lo2);
      do {
         lo3 = lottoNum(45, 1);
      }while(lo1 == lo3 || lo2 == lo3);
      do {
         lo4 = lottoNum(45, 1);
      }while(lo1 == lo4 || lo2 == lo4 || lo3 == lo4);
      do {
         lo5 = lottoNum(45, 1);
      }while(lo1 == lo5 || lo2 == lo5 || lo3 == lo5 || lo4 == lo5);
      do {
         lo6 = lottoNum(45, 1);
      }while(lo1 == lo6 || lo2 == lo6 || lo3 == lo6 || lo4 == lo6 || lo5 == lo6);
      
      System.out.printf("%2d %2d %2d %2d %2d %2d\n",
            lo1, lo2, lo3, lo4, lo5, lo6);
      
   }
}