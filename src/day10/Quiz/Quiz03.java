package day10.Quiz;
// n1부터 n2값 더하기
public class Quiz03 {

	public static int nToSum(int n1, int n2) {
		int sum = 0;
		if (n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		for (int i = n1 + 1; i < n2; i++) {
			sum += i;
		}
		return sum;
	}
}
