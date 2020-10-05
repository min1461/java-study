package day12.quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("길이 입력:");
		int size = in.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 값:");
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.print("배열에 입력된 값의 오름차순은: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("입니다.");
	}
}