package day14.exam;

public class exam01 {
   public static void main(String[] args) {
      //객체를 조립하는 기능
      //말하는 인형
      말하는인형 sd1 = null;
      sd1 = new 말하는인형();   //객체를 생성(메모리에 실체를 만들어내는 것)
      String m = sd1.출력();
      System.out.println(sd1 + "인형 왈:" + m);
      sd1.녹음("객체지향어렵쥬?");
      m = sd1.출력();
      System.out.println(sd1 + "인형 왈:" + m);
      
      말하는인형 sd2 = new 말하는인형();
      sd2.녹음("난 두번째 객체야");
      m = sd2.출력();
      System.out.println(sd2 + "인형 왈:" + m);
      m = sd1.출력();
      System.out.println(sd1 + "인형 왈:" + m);
   }
}