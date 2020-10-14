package Starcraft;

public class CallUnit{
	public static void main(String[] args) {
		Marin mr1 = new Marin();
		Barrack mr2 = new Marin();
		
		mr1.Attack();	// 오버라이딩된 메서드를 호출한다.
		mr2.Attack();
	}
}