package demotest;

public class Q4 {
	public static void main(String[] args) {
		int[] array= {1,20,3,4,12,6};
		int searchElement = 3;
        boolean found = false;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        
        if(!found) {
            System.out.println("Element not found in the array.");

        }
		
	}

}
