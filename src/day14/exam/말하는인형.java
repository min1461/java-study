package day14.exam;

public class 말하는인형 {//
	건전지 batt = null;
	
	final int REC_USE = 11; // 녹음시 필요한 전력량
	final int PRT_USE = 10; // 출력시 필요한 전력량

	String message = "달링알라뷰"; // 클래스의 멤버 필드(변수)
	// static이 붙지 않으면 객체마다 존재

	// 클래스의 멤버 메서드(함수)
	// 모든 객체가 공유하는 코드
	void 녹음(String msg) {
		if (battcheck()) {
			System.out.println("녹음 : 건전지 없음");
			return;
		}
		if (batt.elec(REC_USE) != 0) {
			System.out.println("녹음 : 성공 " + batt.cap);
			message = msg;
			return;
		}
		System.out.println("녹음 : 건전지 부족");
	}

	String 출력() {
		if (battcheck()) {
			System.out.println("출력 : 건전지 없음");
			return null;
		}
		if (batt.elec(PRT_USE) != 0) {

			System.out.println("출력 : 성공 " + batt.cap);
			return message;
		}
		System.out.println("출력 : 건전지 부족");
		return null;
	}

	boolean battcheck() {
		return (batt == null) ? true : false;
	}
	
	final String BATT_TYPE = "AA";
	void setBatt(건전지 b) {
		if(b.type.equals(BATT_TYPE)){
			System.out.println("건전지 장착 성공");
			batt = b;
		} else {
			System.out.println("건전지 타입이 맞지않음");
		}
	}
	
	건전지 removeBatt() {
		건전지 tmp = batt;
		batt = null;
		System.out.println("건전지 제거!");
		return tmp;
	}
}