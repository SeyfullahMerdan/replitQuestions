package for_While_Loop;

import java.util.Arrays;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Write a code that returns the duplicate chars in a String array.(interview
		 * Question)
		 * Input :
		 * String str=“Javaisalsoeasy”
		 * Output: [a, s]
		 */

		
		
		//Scanner scan = new Scanner(System.in);
        //System.out.println("Enter a text:");  
        
		String str = "Javaisalsoeasy";
        
        String duplicate ="";
        
        
        for (int i = 0; i < str.length(); i++) {
		
        	for (int j = i+1; j < str.length(); j++) {
			
        		if (str.charAt(i)==str.charAt(j)) {
        			if (!duplicate.contains(str.substring(j,j+1))) {
        				duplicate+=str.charAt(j);
					}	
				}
			}		
		}
  
		String arr[] = duplicate.split("");

		System.out.println(Arrays.toString(arr));
			
			
			
			
			
		}
	}