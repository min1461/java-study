package day10.exam;

public class exam04{
   public static void callByName() {
      System.out.println("메서드 이름만으로 호출");
   }
   
   public static void callByValue(int n) {
      n = 100;
      System.out.println("callByValue:" + n);
      System.out.println("값을 전달하면서 호출");
   }
   
   public static void callByValue(int[] n) {
      n[0] = 100;
      System.out.println("참조값을 전달하면서 호출");
      //callByReference라고도 표현함
   }
   
   public static void main(String[] args) {
      int n = 1;
      System.out.println("main:" + n);
      callByName();
      callByValue(n);
      System.out.println("main:" + n);
      int[] arr = new int[] {1,2,3};
      System.out.printf("%d, %d, %d\n", arr[0], arr[1], arr[2]);
      callByValue(arr);
      System.out.printf("%d, %d, %d\n", arr[0], arr[1], arr[2]);
   }
}