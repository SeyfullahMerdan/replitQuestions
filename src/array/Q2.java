package array;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {

		/*
		 * Write a Java program that reverse a sentence by using Array (with all spaces
		 * and special characters).
		 * Input : Coding is greate.
		 * Output : .etaerg si gnidoC
		 */
		
		
        String str=  "Coding is greate." ;
		
		String arr[]= str.split("");
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = arr.length-1 ; i >= 0; i--) {
		
		System.out.print(arr[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
