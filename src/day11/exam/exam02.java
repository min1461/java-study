package day11.exam;

import java.util.Random;

//배열: 동일한 자료형으로 메모리에 연속으로 할당된 변수
public class exam02 {
   public static void main(String[] args) {
      Random random = new Random();
//      int lo1 = 0, lo2 = 0, lo3 = 0, lo4 = 0, lo5 = 0, lo6=0;
      int lo1 = random.nextInt(45) + 1;
      int lo2 = random.nextInt(45) + 1;
      int lo3 = random.nextInt(45) + 1;
      int lo4 = random.nextInt(45) + 1;
      int lo5 = random.nextInt(45) + 1;
      int lo6 = random.nextInt(45) + 1;
      
      System.out.printf("%2d %2d %2d %2d %2d %2d\n",
            lo1, lo2, lo3, lo4, lo5, lo6);
      
   }
}