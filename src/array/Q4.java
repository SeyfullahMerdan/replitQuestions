package array;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {

		/*
		 * Create a custom return type method accepts a name as parameter and prints the
		 * name as a char array.
		 * (do not use toCharArray() method)
		 * Input : John
		 * Output :[J, o, h, n]
		 */
		
		
		String name="John";
		
		chr(name);
		
		
	}

	
	private static void chr(String name) {
		
		
		char arr[]= new char [name.split("").length]; // char arrayimi stringin harfleri kadar oluþturdum.
		
		for (int i = 0; i < arr.length; i++) {
		    
		     arr[i]=name.charAt(i);
		
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
