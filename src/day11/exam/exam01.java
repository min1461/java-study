package day11.exam;

import java.util.Random;

//배열 : 동일한 자료형으로 메모리에 연속으로 할당된 변수
public class exam01 {
	public static void main(String[] args) {
		Random random = new Random();
		random.nextInt();

		for (int i = 0; i < 10; i++) {
			int n = random.nextInt();
//			int n = random.nextInt(45)+1; 하면 아래 코드는 필요없음,
			n = Math.abs(n);
			// n = n % 100;//0~99
			// n = n % 100 + 1;//1 ~ 100까지
			// n = n % 11 + 10;//10 ~ 20
			// n = n % 3 - 1;//-1 ~ 1
			n = n % 45 + 1;// 1 ~ 45
			System.out.println(n);
		}
	}
}
