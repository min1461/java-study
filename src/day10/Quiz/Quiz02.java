package day10.Quiz;
//return을 사용한 Quiz01;
import java.util.Scanner;

public class Quiz02 {
	public static int bigNum(int a, int b) {
		if (b >= a) {
			return b;
		}else {
			return a;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 값  : ");
		int a = in.nextInt();
		System.out.print("두번째 값  : ");
		int b = in.nextInt();
		System.out.print("큰값 : " + bigNum(a,b));
	}
}
