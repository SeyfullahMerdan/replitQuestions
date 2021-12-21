package array;

public class Q7 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array as parameter and returns sum off all
		 * elements in the array Then print the result in the main method.
		 * Eg :
		 * input : {1,2,3,4,5,6,7,8}
		 * output: 36
		 */

	
		int arr[]={1,2,3,4,5,6,7,8};
		
		sum(arr);
		
	
	}

	
	
	private static void sum(int[] arr) {
		
		int toplam=0;
		
	
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		
		System.out.println(toplam);
		
	}

        
	
	
	
	
	
}
