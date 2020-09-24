package day09.exam;

//break 탈출
public class exam02 {
	public static void main(String[] args) {
		FIRST: for (int i = 0; i < 3; i++) {
			SECOND: for (int j = 0; j < 2; j++) {
				int n = 0;
				while (true) {
					System.out.println("while");
					n++;
					if (n == 3) {
						break FIRST;
						// break SECOND;
					}

				}
			}
		}
	}

}
