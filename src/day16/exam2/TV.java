package day16.exam2;

public class TV {
	static String brand = "NOBRAND";		// 클래스 멤버
	
	static {
		brand = "test";
	}
	int channel;		// 인스턴스 멤버

	static void setBrand(String brand) {		// 클래스 멤버
		// 클래스 필드를 조작하기 위한 메서드
		/*this.*/TV.brand = brand;
		// channel = 10; // 인스턴스 멤버는 사용 불가(메모리에서 사용 가능한 시점이 다름)
	}
	
	void print() {		// 인스턴스 멤버
		System.out.println("brand : " + brand);		// 클래스 멤버
//		TV.setBrand(""); // this.setBrand(""); 로도 사용 가능, 클래스 멤버 사용 가능
		System.out.println("channel : " + channel);
	}
}