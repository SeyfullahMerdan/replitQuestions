package for_While_Loop;

public class Q07 {

	public static void main(String[] args) {
		/*
		 Write java code checking the number is Perfect number or not.

         Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
         Input :6 Output:6 is Perfect Number Input :7 Output:7 is not Perfect Number 
		 
		 */

		
		int testData = 12;
		int divisors=0;

		for (int i = 1; i < testData; i++) {
	
			if (testData%i == 0) {
				divisors+=i;
			}	
		}
		
		if (divisors==testData) {
			System.out.println( "This is a Perfect Number " );
		} else {
			System.out.println( "This is not a Perfect Number " );
		}
	
	}

}
