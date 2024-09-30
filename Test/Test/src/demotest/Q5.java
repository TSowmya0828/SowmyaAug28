package demotest;

public class Q5 {
	public static void main(String[] args) {
		int[] arr= {10,-15,3,-5,1,-10};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				sum+=arr[i];
			}
		}
		System.out.println("Sum of Negative Numbers:" + sum);
 	}

}
