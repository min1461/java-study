package Starcraft;

public class Marin extends Barrack {
	public Marin() {
		System.out.println("마린");
	}
	
	public void Attack() { // 오버라이딩?
		System.out.println("공격 소리 : 두두두둥! 두두두둥!");
	}
}
