package for_While_Loop;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts an integer as input and calculates
		 * factorial and prints like output. 
		 * Input : 6
		 * Output: 6!=65432*1=720
		 */

		
		int testData=6;
		int factorial=1;
	
		
		for (int i = 1; i <= testData; i++) {
			
			factorial=factorial*i;
			
		}
		
		
		System.out.println( testData+"!=65432*1=" + factorial);
		
		
		
		
		
		
		
	}

}
