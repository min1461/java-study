package day10.Quiz;

public class Quiz12 {
   
   //반복문을 이용한 팩토리얼 구하기
   public static long factorial1(int n) {
      int f = 1;
      for(int i = n; i > 0; i--) {
         f *= i;
      }
      return f;
   }

   //재귀호출을 이용한 팩토리얼 구하기
   public static long factorial2(int n) {
      if(n == 0) {
         return 1;
      }else {
         return n * factorial2(n-1);
      }
   }
   
   //동작 시 메모리 사용 개념을 정리하세요.
   
   
   public static void main(String[] args) {
      System.out.println(factorial1(0));
      System.out.println(factorial1(1));
      System.out.println(factorial1(4));
      
      System.out.println(factorial2(0));
      System.out.println(factorial2(1));
      System.out.println(factorial2(4));
   }
}