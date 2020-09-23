package day08.quiz_Star;

public class Quiz23 {
	/*
	 * 첫날에 10원을 예금하고, 다음날에는 전날의 2배를 예금하는 방식으로 한달 동안 저축한 금액은?
	 */
	public static void main(String[] args) {
		long bank = 0;
		long save = 10;
		int days = 30;

		for (int day = 1; day <= days; day++) {
			bank += save;
			save *= 2;
		}System.out.println((long)bank+"원");
	}
}