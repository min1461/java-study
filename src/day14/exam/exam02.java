package day14.exam;

public class exam02 {
   public static void main(String[] args) {
      //객체를 조립하는 기능
      //말하는 인형
      말하는인형 sd1 = null;
      sd1 = new 말하는인형();   //객체를 생성(메모리에 실체를 만들어내는 것)
      String m = sd1.출력();	  
      System.out.println(sd1 + "인형 왈:" + m);

      건전지 b1 = new 건전지();
      b1.cap = 100;
      b1.type = "AA";
      
      sd1.setBatt(b1);
      sd1.녹음("객체지향어렵쥬?");
      m = sd1.출력();
      System.out.println(sd1 + "인형 왈:" + m);
      b1 = sd1.removeBatt();
      
      말하는인형 sd2 = new 말하는인형();
      sd2.setBatt(b1);
      sd2.녹음("난 두번째 객체야");
      m = sd2.출력();
      System.out.println(sd2 + "인형 왈:" + m);
      
      건전지 b2 = new 건전지();
      b2.cap = 50;
      b2.type = "AA";
      
      sd1.setBatt(b2);
      m = sd1.출력();
      System.out.println(sd1 + "인형 왈:" + m);
      m = sd1.출력();
      System.out.println(sd1 + "인형 왈:" + m);
      m = sd1.출력();
      System.out.println(sd1 + "인형 왈:" + m);
      m = sd1.출력();
      System.out.println(sd1 + "인형 왈:" + m);
      m = sd1.출력();
      System.out.println(sd1 + "인형 왈:" + m);
      m = sd1.출력();
      System.out.println(sd1 + "인형 왈:" + m);
   }
}