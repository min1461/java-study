package day18.quiz2;

public class animalDo {
	public static void main(String[] args) {
		animal d1 = new Dog();
		animal c1 = new Cat();
//		animal a1 = new animal(); // 추상 클래스는 객체 생성 불가
		
		animal[] as = new animal[] {
				d1, c1
		};
//		
//		//d1이 참조하는 객체가 개타입이냐? t
//		System.out.println(d1 instanceof Dog);
//		
//		System.out.println(d1 instanceof Cat);
//		//instanceof를 이용하여 클래스의 타입을 확인할 수 있음
//		
		for(int i = 0; i < as.length; i++) {
			as[i].attack();
			as[i].cry();
			as[i].sleep();
			
			if(as[i] instanceof Dog) {
				Dog tmp = (Dog)as[i];
				tmp.Dogs();
			}else if(as[i] instanceof Cat) {
				Cat tmp = (Cat)as[i];
				tmp.Cats();
			}
		}
		c1.death(); // abstract
		
		
	}
}
