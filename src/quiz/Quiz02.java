package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("��� �����ڸ� �Է��ϼ���(+,-,*,/,%):");
		char op = in.nextLine().charAt(0);

		String result =
				(op == '+' ||
				 op == '-' ||
			 	 op == '*' ||
				 op == '/' ||
				 op == '%') ? "����������Դϴ�." : "��������ڰ� �ƴմϴ�.";
		// ��������
		System.out.println(op+"��"+result);
		in.close();
	}

}
