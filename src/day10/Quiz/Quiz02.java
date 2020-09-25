package day10.Quiz;
//return을 사용한 Quiz01;
import java.util.Scanner;

public class Quiz02 {
	public static void bigNum(int a, int b) {
		if (b >= a) {
			return;
		}else {
			int max = 0;
			max = a;
			return max;
			System.out.print("큰값 : " + max);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 값  : ");
		int a = in.nextInt();
		System.out.print("두번째 값  : ");
		int b = in.nextInt();
		bigNum(a,b);
	}
}
