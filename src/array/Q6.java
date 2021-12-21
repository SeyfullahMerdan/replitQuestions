package array;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an integer array as input and prints the minimum
		 * and the maximum numbers from given array
		 * Input : {3,2,5,4,1,6}
		 * Output :
		 * min: 1
		 * max: 6
		 */
	
		int arr[]= {3,2,5,4,1,6};
	    mm(arr);			
	
	}

	
	
	private static void mm(int[] arr) {

	Arrays.sort(arr);
	System.out.println("Minimum number from array: " + arr[0]         );
	System.out.println("Maximum number from array: " + arr[arr.length-1] );
		
	}

	
	
	
}
