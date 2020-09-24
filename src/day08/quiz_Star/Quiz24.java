package day08.quiz_Star;

public class Quiz24 {
	// 1부터 홀수를 더했을때 10000보다 작은 수
	public static void main(String[] args) {
		int sum = 0;
		int n = 0;

		for (n = 1; sum < 10000; n++) {
			if (n % 2 == 1) {
				sum += n;
			}
		}
		System.out.println("sum : " + sum);
		System.out.println("마지막수 : " + (n-1));

	}
}