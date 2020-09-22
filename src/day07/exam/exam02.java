package day07.exam;

public class exam02 {
	public static void main(String[] args) {

		for (char i = 'A'; i <= 'Z'; i++) {
			if (i != 'Z') {
				System.out.print(i+", ");
			} else {
				System.out.println(i);
			}
		}
	}
}