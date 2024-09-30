package demotest;

public class Q10 {
	public static void main(String[] args) {
		int[] a1= {1,2,3};
		int[] a2= {4,5,6};
		
		int[] a3=new int[a1.length +a2.length];
		
		for(int i=0;i<a1.length;i++) {
			a3[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			a3[a1.length + i]=a2[i];
		}
		System.out.println("Merged Array:");
		for(int num:a3) {
			System.out.print(num + " ");
		}
	}

}
