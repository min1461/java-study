package day13.quiz;

import java.util.Scanner;

//5명의 이름과 나이를 저장 (String배열?)
//나이 순으로 정렬하여 출력
public class Quiz01 {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] names = new String[5];
    int[] ages = new int[5];
    
    for(int i = 0; i < names.length; i++) {
       System.out.println(i+1+"번째 사람 정보 입력");
       System.out.print("이름:");
       names[i] = in.nextLine();
       System.out.print("나이:");
       ages[i] = Integer.parseInt(in.nextLine());
    }
    printInfo(ages, names);
    selectSort(names, ages);
    System.out.println("-----------------------");
    printInfo(ages, names);
 }
 
 public static void printInfo(int[] a, String[] n) {
    for(int i = 0; i < a.length; i++) {
       System.out.println(i+1+"정보");
       System.out.println("이름:" + n[i] + ", 나이:" + a[i]);
    }
 }
 
 public static void selectSort(String[] na, int[] ag){
    for(int i = 0; i < na.length-1; i++) {
       for(int j = i+1; j < na.length; j++) {
          if(ag[i] < ag[j]) {
             int tmp = ag[i];
             ag[i] = ag[j];
             ag[j] = tmp;
             String tmp2 = na[i];
             na[i] = na[j];
             na[j] = tmp2;
          }
       }
    }
 }
}