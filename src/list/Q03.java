package list;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Q03 {

	public static void main(String[] args) {
	
		/*
		 * Get a sentence from the user. Accept the sentence received from the user as a
		 * parameter, Invert sentence using Array and write a Method that returns the
		 * result as a String to the main method.
		 * Note: Upper and lower case letters, spaces and special characters will not be
		 * changed.
		 * 
		 * Input :
		 * It is very nice to write code.
		 * 
		 * Output :
		 * .edoc etirw ot ecin yrev si tI
		 */

		
		String testData= "It is very nice to write code.";
		String arr[]= testData.split("");
		
		reverse(arr);
		
	}

	
	
	private static void reverse(String[] arr) {

	
		String str="";
		
		for (int i = arr.length-1; i >= 0; i--) {
			
			str+=arr[i];
			
		}
		
		System.out.println(str);
		
	}

	
	
	
}
