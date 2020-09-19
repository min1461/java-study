package day04.quiz;

import java.util.Scanner;

public class Quiz03 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
/*      
      System.out.print("당신의 이름은 무엇입니까?");
      String name = in.nextLine();
      System.out.print(name + "님의 나이는 몇 살 입니까?");
      int age = in.nextInt();
      System.out.println(name+"님의 나이는 "+age+"살입니다.");
*/
      System.out.print("당신의 이름은 무엇입니까?");
      String name = in.nextLine();
      System.out.printf("%s님의 나이는 몇 살 입니까?", name);
      int age = in.nextInt();
      System.out.printf("%s님의 나이는 %d살입니다.", name, age);
      in.close();
   }
}