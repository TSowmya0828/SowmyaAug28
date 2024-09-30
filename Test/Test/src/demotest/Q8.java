package demotest;

public class Q8 {
	public static void main(String[] args) {
		 int[] arr = {12, 14, 16, 18,20};
	        int sum = 0;

	        for (int n : arr) {
	            sum += n;
	        }

	        double avg = (double) sum / arr.length;
	        System.out.println("Average of array elements: " + avg);

	}

}
