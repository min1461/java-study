package day13.exam;

public class exam02 {
   public static void main(String[] args) {
      int[][] ages = new int[][] {
         {1,2,3},
         {4,5,6}
      };
      
      String[][] names = new String[][] {
         {"홍길동1", "홍길동2"},
         {"이순신1", "이순신2", "이순신3"}
      };
      
      for(int i = 0; i < ages.length; i++) {
         for(int j = 0; j < ages[i].length; j++) {
            System.out.print(ages[i][j] + ",");
         }
         System.out.println();
      }
      
      for(int i = 0; i < names.length; i++) {
         for(int j = 0; j < names[i].length; j++) {
            System.out.print(names[i][j] + ",");
         }
         System.out.println();
      }
      
      
   }
}