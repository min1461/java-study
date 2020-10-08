package day16.exam;

public class Counter {
	   private int count;
	   
	   public void increment(/*Counter this*//*Counter THIS*/) {
//	      System.out.println("inc를 호출한 객체:" + THIS);
	      System.out.println("inc를 호출한 객체:" + this);

//	      THIS.count++;
	      this.count++;
	   }
	   
	   public int getCount(/*Counter this*/) {
	      return this.count;
	   }
	}