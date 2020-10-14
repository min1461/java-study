package day17.quiz;

/*
 * 필드
 * 	int형 배열 참조 변수 (int[]arr)
 * 	int형 길이(int length)
 * 
 * 메서드
 * 	디폴트 생성자(5개의 배열 생성)
 * 	생성자 오버로딩(정수를 전달받아 길이로 사용)
 * 	setter 2개
 * 	배열 참조를 전달받아 세팅
 * 	위치와 값을 전달받아 세팅
 * 	getter 2개
 * 	기존 배열 참조를 반환
 * 	위치를 받아 해당 위치 값을 반환
 */
public class MyArray {
	private int[] array;
	private int length;
	public static final int DEFAULT_LENGTH = 5;

	public MyArray() {
		// array = new int[DEFAULT_LENGTH];
		// length = DEFAULT_LENGTH;
		this.setInitArray(DEFAULT_LENGTH);
	}

	public MyArray(int length) {
		// array = new int[length];
		// this.length = length;
		this.setInitArray(length);
	}

	private void setInitArray(int length) {
		array = new int[length];
		this.length = length;
	}

	public void setArray(int[] array) {
		// this.array = array; //문제 발생 가능(배열 참조 변경 시 length 값 변경되지 않기 때문)

		// 새로운 배열을 생성하고
		this.array = new int[array.length];

		// 전달받은 참조가 참조하는 배열 객체의 각 값을 복사
		for (int i = 0; i < array.length; i++) {
			this.array[i] = array[i];
		}
		this.length = array.length; // 문제 해결
	}

	public void setArray(int index, int value) {
		if (lengthChk(index)) {
			this.array[index] = value;
		}
	}

	public int[] getArray() {
		int[] tmp = new int[length];

		for(int i = 0; i < length; i++) {
			tmp[i] = array[i];
		}
		return tmp;
	}

	public int getArray(int index) {
		if (lengthChk(index)) {
			return array[index];
		}
		return Integer.MIN_VALUE;	// 최소값
	}

	private boolean lengthChk(int index) {
		return (index < length) ? true : false;
	}

	public int length() {
		return this.length;
	}
}