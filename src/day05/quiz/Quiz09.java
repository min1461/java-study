package day05.quiz;

import java.util.Scanner;

/*
 * ���������� ���� �¿��ִµ� 
 * ó�� 30���� �⺻����� 1�δ� 3000���̴�. 
 * ���Ŀ��� 10�д� 500������ �߰� ����� �޴´�. 
 * ���� ź �ð��� �Է� �޾Ƽ� 
 * ��ü �ݾ��� ����ϴ� ���α׷��� �ۼ��Ͽ���.
 */
public class Quiz09 {
	public static void main(String[] args) {
		// final�� ����� ������ ���ȭ�� �����̴�.
		final int baseTime = 30;// 30�� �⺻�̿�ð�
		final int basePrice = 3000;// 3000�� �⺻�̿��
		final int perAddTime = 1;// 10�д� �߰���ݱ��ؽð�
		final int perAddPrice = 50;// 500�� �߰��̿��
		int useTime = 0;// �̿�ð�
		int usePrice = 0;// �̿�ݾ�

		Scanner in = new Scanner(System.in);
		System.out.print("�� ź �ð�:");
		useTime = in.nextInt();
		in.close();
		if (useTime <= baseTime) {
			usePrice = basePrice;
		} else {
			int useAddTime = useTime - baseTime;
			usePrice = useAddTime / perAddTime * perAddPrice;
			usePrice += basePrice;
		}

		System.out.println("�̿�ݾ�:" + usePrice);
	}
}
