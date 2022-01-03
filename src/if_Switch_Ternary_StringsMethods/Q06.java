package if_Switch_Ternary_StringsMethods;

import java.util.Scanner;

public class Q06 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Ask user to type a name,
		 * 
		 * the length of name should be 3.
		 * 
		 * Then check if the name has same characters.
		 * 
		 * If the String has same characters
		 * 
		 * Print “String has duplicate characters” Else
		 * 
		 * Print “String has unique characters”
		 * 
		 * Please use ternary.
		 * 
		 * Input :
		 * 
		 * ala
		 * 
		 * OutPut:
		 * 
		 * String has duplicate characters
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Type a name please: \nThe length of name should be 3: ");
		
		String name=scan.nextLine().toLowerCase();
		
		if (name.length()>3) {
		
			System.out.println("Invalid entry, please try again!");
		
		} else {
	
		      if (name.charAt(0)==name.charAt(1)) {
			     System.out.println("String has duplicate characters");
		      } else if (name.charAt(0)==name.charAt(2) ) {
			     System.out.println("String has duplicate characters");
		      } else if (name.charAt(1)==name.charAt(2) ) {
			     System.out.println("String has duplicate characters");
		      } else {
			     System.out.println("String has unique characters");
		                                                               }
		}
		
		scan.close();
		
	}

}
