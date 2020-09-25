package day10.exam;

public class exam02{
   
   public static void main(String[] args) {
      System.out.println("main method시작");
      method1();
      System.out.println("main method종료");
   }
   
   public static void method1() {
      System.out.println("method1호출");
      method2();
      System.out.println("method1종료");
   }
   public static void method3() {
      System.out.println("method3호출");
      System.out.println("method3종료");
   }
   public static void method2() {
      System.out.println("method2호출");
      method3();
      System.out.println("method2종료");
   }
}