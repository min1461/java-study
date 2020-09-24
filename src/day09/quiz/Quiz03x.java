package day09.quiz;

import java.util.Scanner;
//거꾸로 출력하기
public class Quiz03x {
	public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = 0;
    System.out.println("수 입력 : ");
    n = in.nextInt();
    int cnt = 0;
    int tmp1 = n;
    int tmp2 = 0;
    // 자리수 구하기
    while (true) {
       tmp2 = tmp1 % 10;
       tmp1 /= 10;
       cnt++;
       if (tmp1 == 0)
          break;
    }
    System.out.println(cnt);
    // 자리수 합 구하기
    int total = 0;
    tmp1 = n;
    for (int i = cnt; i > 0; i--) {
       tmp2 = tmp1 % 10;
       tmp1 /= 10;
       int gop = 1;
       for (int j = 1; j < i; j++)
          gop *= 10;
       total += tmp2 * gop;
       System.out.println(total);
    }
    System.out.println("거꾸로 수 : " + total);

 }

}
