package for_While_Loop;

public class Q09 {

	public static void main(String[] args) {
		/* Write a java program to reverse the number which user entered.

      Input :1238
      Output :Reverse Of The Number: 8321    */

	
		int testData=1238;
		
		String str=Integer.toString(testData);

		
		String testDataReverse="";
		
		for (int i = str.length()-1; i >= 0   ; i--) {
			
			testDataReverse+= str.charAt(i);

			
		}
		
		System.out.println("Reverse Of The Number: "+testDataReverse);
		
		
		
	
	}

}
