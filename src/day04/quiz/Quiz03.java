package day04.quiz;

import java.util.Scanner;

public class Quiz03 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
/*      
      System.out.print("����� �̸��� �����Դϱ�?");
      String name = in.nextLine();
      System.out.print(name + "���� ���̴� �� �� �Դϱ�?");
      int age = in.nextInt();
      System.out.println(name+"���� ���̴� "+age+"���Դϴ�.");
*/
      System.out.print("����� �̸��� �����Դϱ�?");
      String name = in.nextLine();
      System.out.printf("%s���� ���̴� �� �� �Դϱ�?", name);
      int age = in.nextInt();
      System.out.printf("%s���� ���̴� %d���Դϴ�.", name, age);
      in.close();
   }
}