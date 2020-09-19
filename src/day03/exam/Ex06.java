package day03.exam;

import java.util.Scanner;
// import-다른 패키지에 정의된 클래스를 사용하고자 선언하는 것

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름입력:");
		String name = scan.nextLine();
		System.out.println(name);

		System.out.print("나이입력:");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.print("키입력:");
		float height = scan.nextFloat();
		System.out.println(height);
		
		scan.close();

	}

}
