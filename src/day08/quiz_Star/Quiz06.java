package day08.quiz_Star;

public class Quiz06 {
   public static void main(String[] args) {
      System.out.println("Q6.");
      for(int i = 1; i <= 5; i++) {
         for(int j = i; j < i+5; j++) {
            System.out.print(j);
         }
         System.out.println();
      }
      System.out.println();
      System.out.println("Q6. ");
      int cnt = 1;
      int cnt2 = 1;
      for(int i = 0; i < 5; i++) {
    	  cnt = cnt2;
         for(int j = 0; j < 5; j++) {
            System.out.print(cnt);
            cnt++;
         }
         System.out.println();
         cnt2++;
      }
   }
}