package day04.quiz;

import java.io.IOException;
import java.util.Scanner;

//�ڽ��� �̴ϼ�(String/char)�� �Է� �޾� ����Ͻÿ�.
public class Quiz01 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		// System.in.read()�� �̿�
		System.out.print("ù ��° �̴ϼ�:");
		int in1 = (char) System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("�� ��° �̴ϼ�:");
		int in2 = (char) System.in.read();
		scan.nextLine();
		System.out.print("�� ��° �̴ϼ�:");
		int in3 = (char) System.in.read();
		System.out.println();
		System.out.println();
		System.out.println(in1 + "." + in2 + "." + in3);

		// char�� �̿�
//      System.out.print("ù ��° �̴ϼ�:");
//      char in1 = scan.nextLine().charAt(0);
//      System.out.print("�� ��° �̴ϼ�:");
//      char in2 = scan.nextLine().charAt(0);
//      System.out.print("�� ��° �̴ϼ�:");
//      char in3 = scan.nextLine().charAt(0);

//      System.out.println(in1 + "." + in2 + "." + in3);

		// String�� �̿�
		/*
		 * System.out.print("�̴ϼ� �Է�:");
		 * 
		 * String init = scan.nextLine();
		 * 
		 * System.out.println("�Է��� �̴ϼ�:" + init);
		 */
		scan.close();
	}
}