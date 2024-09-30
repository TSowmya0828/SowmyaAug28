package demotest;

import java.util.HashSet;

public class Q6 {
	public static void main(String[] args) {
		int[] arr = {1, 1,0,0,3,2, 5, 6,8,2, 6};
		HashSet<Integer> uniqEle= new HashSet<>();

		for (int num : arr) {
			
		    uniqEle.add(num);  
		}
		System.out.println("Unique elements in the array are: " + uniqEle);

	}

}
