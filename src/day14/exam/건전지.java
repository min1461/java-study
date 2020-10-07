package day14.exam;

public class 건전지{
	// 값
	String type; // AA,AAA ...
	int cap; // 용량

	// 건전지의 기능
	int elec(int use) {
		if (cap - use < 0) {
			return 0;
		}else {
			cap -= use;
			return use;
		}
	}
}
