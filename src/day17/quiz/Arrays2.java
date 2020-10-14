package day17.quiz;

public class Arrays2 {
	public static void main(String[] args) {
		MyArray ma1 = new MyArray();
		int[] arr = new int[] {1,2,3};
		ma1.setArray(arr);
		arr[1] = 100;
		
		for(int i = 0; i<ma1.length(); i++) {
			System.out.println(ma1.getArray(i));
		}
	}
}
