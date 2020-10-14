package Starcraft;

public class StarCraft {
	String stc = "";
	StarCraft(String stc) {
		this.stc = stc;
	}
	
	public StarCraft() {
		System.out.println("스타크래프트");
	}

	public void Company() {
		System.out.println("회사 : 블리자드");
		System.out.println("게임 출시 일 : 1998년 3월 31일");
	}
	
	public void Attack() { // 오버라이딩?
		System.out.println(stc + "의 공격");
	}
	
	public void Move() {
		System.out.println(stc + "의 이동");
	}
	
	public void Stop() {
		System.out.println(stc + "의 정지");
	}
	
	public void Death() {
		System.out.println(stc + "의 죽음");
	}
}
