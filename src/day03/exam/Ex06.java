package day03.exam;

import java.util.Scanner;
// import-�ٸ� ��Ű���� ���ǵ� Ŭ������ ����ϰ��� �����ϴ� ��

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�̸��Է�:");
		String name = scan.nextLine();
		System.out.println(name);

		System.out.print("�����Է�:");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.print("Ű�Է�:");
		float height = scan.nextFloat();
		System.out.println(height);
		
		scan.close();

	}

}
