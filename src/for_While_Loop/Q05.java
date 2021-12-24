package for_While_Loop;

public class Q05 {

	public static void main(String[] args) {
		/*
		 Print even numbers from 20 to 0 but do not use decrement (i--).

         OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
		 */

		
		int number=-20;
	    String strN=" ";
			
			while (number<=0) {
			
				if (number%2==0) {
					
				//System.out.print( -1*number + " "   );
	        strN+= (-1*number) + " ";

				}
				
			number++;
			}



	System.out.print ("Even Numbers from 20 to 0 are:"+strN);

	}

}
