\package day18.quiz;

class MyArrayUtil {
	int[] arr;
	int length;
	
	public MyArrayUtil() {
		arr = new int[5];
	}
	
	public MyArrayUtil (int length) {
		this.setLength(length);
	}
	
	private void setLength(int length) {
		arr = new int[length];
		this.length = length;
	}
	
	public void setArray(int[] arr) {
		this.arr = new int[arr.length];
		
		for (int i = 0; i<arr.length; i++) {
			this.arr[i] = arr[i]; 
		}
		this.length = arr.length;
	}
}



public class MyArrayUtil {
	public static void main(String[] args) {

	}
}
