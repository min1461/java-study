package day16.exam2;
/*
 * 인스턴스 멤버(new 메모리에 생성)
 *  객체를 생성하고 참조변수를 통해 사용할 수 있는 멤버
 *
 * 클래스 멤버(클래스가 메모리에 로딩 되면 생성)
 *  객체 생성 없이 클래스명으로 사용할 수 있는 멤버
 * 
 * static (정적)
 *  클래스의 멤버를 표현
 *  static멤버는 객체 생성과 무관하게 클래스명으로 접근 가능
 *  this의 개념이 없음
 *  
 *  멤버 필드에 적용되었을 때
 *     동일한 클래스로 생성된 객체들이 공유하는 필드
 *  멤버 메서드에 적용되었을 때
 *     클래스 멤버 필드를 조작하기 위한 용도
 */
public class exam01 {
   static void method() {
      System.out.println("test");
   }
   
   
   public static void main(String[] args) {
      method();
      
      TV.setBrand("삼성");
      TV.brand = "삼성";
      
      TV tv1 = new TV();
      //tv1.brand = "삼성";
      tv1.channel = 10;
      
      TV.setBrand("LG");
      
      TV tv2 = new TV();
      //tv2.brand = "삼성";
      tv2.channel = 20;
      
      TV tv3 = new TV();
      //tv3.brand = "삼성";
      tv3.channel = 30;

      tv1.print();
      tv2.print();
      tv3.print();
   }
}