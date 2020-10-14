package day17.quiz;

public class Arrays {
	   public static void main(String[] args) {
	      MyArray ma1 = new MyArray();
	      ma1.setArray(0, 10);
	      ma1.setArray(1, 20);
	      ma1.setArray(2, 30);
	      ma1.setArray(3, 40);
	      ma1.setArray(4, 50);
	      
	      ma1.setArray(0, 100);
	      System.out.println(MyArray.DEFAULT_LENGTH);
	      System.out.println(ma1.getArray(2));
	      
	      int[] result = ma1.getArray();
	      for(int i = 0; i < ma1.length(); i++) {
	         System.out.print(result[i] + ",");
	      }
	      
	      int[] arr = new int[] {1,2,3};
	      ma1.setArray(arr);
	      result = ma1.getArray();
	      for(int i = 0; i < ma1.length(); i++) {
	         System.out.print(result[i] + ",");
	      }
	      
	      
	      MyArray ma2 = new MyArray(6);
	      
	      MyArray ma3 = new MyArray();
	      ma3.setArray(arr);
	      
	      

	   }
	}