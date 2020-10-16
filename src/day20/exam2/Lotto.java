package day20.exam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random ran = new Random();
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		HashMap<Integer> valid = new HashMap<Integer>();
		while(lotto.size()<6) {
			int n = ran.nextInt(45)+1;
			valid.add(n);
		}
		lotto.addAll(valid);
		for(Integer number : lotto) {
			System.out.println(number+", ");
		}
	}
}
