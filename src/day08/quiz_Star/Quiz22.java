package day08.quiz_Star;

public class Quiz22 {
	/*
	 * 쌀 100통이 저장되어 있는 창고에 암수 1쌍의 쥐가 있다. 쥐 한마리가하루에 20g씩의 쌀을 먹고 10일마다 쥐의 수가 2배씩 증가한다.
	 * 며칠만에 창고의 쌀이 모두 쥐의 먹이가 될까? 그리고 쥐는 총 몇마리 인가??(한 통은 80kg)
	 */
	public static void main(String[] args) {
		// 100통 = 8000kg = 8000000g
		// 쥐 2마리 10일후 2배
		int mouse = 2;
		int rice = 8000000;
		int days = 30;
		int eat = 20;

		for (int day = 1; rice >= 0; day++) {
			System.out.println("현재rice : " + rice + "g");
			rice = rice - (mouse * eat);
			System.out.println("쥐:" + mouse + "마리");
			System.out.println("먹은 양 : " + (eat * mouse) + "g먹음");
			System.out.println("남은 쌀 : " + rice + "g");
			System.out.println("경과일수 : " + day + "일");
			if (day % 10 == 0) {
				mouse *= 2;
			}

			System.out.println();
		}
	}
}