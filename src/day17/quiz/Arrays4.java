package day17.quiz;

public class Arrays4 {
	public static void main(String[] args) {
		MyArray ma1 = new MyArray();
		ma1.setArray(0, 1);
		ma1.setArray(1, 2);
		ma1.setArray(2, 3);
		ma1.setArray(3, 4);
		ma1.setArray(4, 5);

		int[] result = ma1.getArray();
		// ma1객체가 array멤버 필드로 참조하는 배열을 result도 참조
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		System.out.println("☆==============================");
		result[0] = 100;

		for (int i = 0; i < ma1.length(); i++) {
			System.out.println(ma1.getArray(i));
		}

		System.out.println("★==============================");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}