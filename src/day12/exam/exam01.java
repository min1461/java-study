package day12.exam;

//배열 : 동일한 자료형으로 메모리에 연속으로 할당된 변수
//배열 생성 방법
// 자료형[] 참조변수명; 해당 타입의 배열객체를 참조할 수 있는 변수 선언
// 참조변수는 배열객체를 참조하지 않으면 의미가 없음
// 배열 초기화 방법
// 자료형 [] 참조변수명 = {자료형타입의값1,자료형타입의값2,자료형타입의값3,...}
public class exam01 {
	public static void main(String[] args) {
		int[] a = null; // 정수타입의 배열을 참조하는 변수 선언
		a = new int[6];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println();
		int[] b = { 1, 2, 3 }; // 선언하면서 배열 초기화
//		b = {4,5,6}// 틀린문법
		int[] c = new int[] { 4, 5, 6 };
		int[] d = new int[4]; // {} < 사용 불가

		for (int i = 0; i < 3; i++) {
			System.out.println(b[i]);
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println();
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		System.out.println(d.length);

		// 배열 초기화 시 별도의 값을 지정하지 않으면 모두 자동으로 0에 해당되는 값으로 초기화
		System.out.println();
		int[] e = new int[5];
		// boolean , string  : false , NULL 입력되있음
		for (int i = 0; i < e.length; i++)
			System.out.println(e[i]);
	}
}
