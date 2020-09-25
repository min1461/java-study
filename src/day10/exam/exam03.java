package day10.exam;

import java.util.Scanner;

/*
 * 메서드: 자주 사용할 코드(기능)를 미리 정의해 둔 것
 *          필요할 때 Call(호출)해서 결과 반환 값을 활용(없을 수도 있음)
 * 메서드 호출 전달하는 값을 인자(argument)라고 함.
 * 메서드에서 인자를 저장하는 변수를 매개변수(parameter)라고 함.
 */
public class exam03 {
   
   public static int helloJavaPrint(int n, int n2) {
      System.out.println("전달 받은 값:" + n + "," + n2);
      
      System.out.println("안녕자바!");
      return n + n2;
   }
   
   public static void main(String[] args) {
      
   //...
      //...
      //...
      int ret = helloJavaPrint(10, 20);
      System.out.println(ret);
      //..
      //..
      ret= helloJavaPrint(1, 2);
      System.out.println(ret);
      int a = 100, b = 200;
      //...
      //....
      //,,,,
      //....
      ret = helloJavaPrint(a, b);
      System.out.println(ret);
   }
}