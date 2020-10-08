package day16.exam;

public class Point {
	   private int x;
	   private int y;
	   
	   public Point(/*Point this*/) {
	      this(-1, -2);//Point(/*Point this,*/int x, int y)호출 
//	      System.out.println("디폴트 생성자");
	   }
	   public Point(/*Point this,*/int x, int y) {
	      this.x = x;
	      this.y = y;
	   }
	   public int getX(/*Point this*/) {
	      return x;
	   }
	   public void setX(/*Point this,*/int x) {
	      this.x = x;
	   }
	   public int getY(/*Point this,*/) {
	      return this.y;
	   }
	   public void setY(/*Point this,*/int y) {
	      this.y = y;
	   }
	   public void printPoint(/*Point this*/) {
	      System.out.println("x:" + x + ", y:" + y);
	   }
	}