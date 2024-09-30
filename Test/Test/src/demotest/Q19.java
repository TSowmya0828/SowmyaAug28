package demotest;

public class Q19 {
	public static void main(String[] args) {
		String s1="Virat";
		String s2="Virat";
		String maxstr;
		
		int comparison=s1.compareTo(s2);
		if(comparison>0){
			maxstr=s1;
		}
		else if(comparison<0) {
			maxstr=s2;
		}
		else {
			maxstr="Both are equal";
		}
		System.out.println("The string is : "+ maxstr);

		
	}

}
