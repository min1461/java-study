package day17.quiz;

public class Arrays3 {
	public static void main(String[] args) {
		MyArray ma1 = new MyArray();	// 기본 5칸 짜리
		
//		if(n <5) {
//		ma1.setArray(n,100);

		ma1.setArray(100,100);
		ma1.setArray(3,200);
		ma1.setArray(7,300);
		ma1.setArray(2,400);
		
		for(int i = 0; i<ma1.length();i++) {
			System.out.println(ma1.getArray(i));
			ma1.getArray();
		}

		System.out.println(ma1.getArray(100));
		System.out.println(ma1.getArray(3));
		System.out.println(ma1.getArray(7));
	}
}
