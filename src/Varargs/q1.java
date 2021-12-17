package varargs;

public class Q1 {

	/* Write a return method that accepts more
	than one integer as parameter and prints the
	sum of integers 
	Method name=sum if you call method like that 
	 sum(1,2,3) output =6 
	 sum(1,2,3,4,5) output =15 
	 sum(1,2) output=3	
	*/
	
	public static void main(String[] args) {
		
		int nm1=1;
		int nm2=2;
		
		sum (nm1,nm2);
		sum (1,2,3,4,5);
		sum (1,2,3);
		
		
	}
	
	
	
	private static int sum (int... numbers) {
		

		int plus=0;
		
		for (int i : numbers) {
			plus+=i;
		}
		
		System.out.println(plus);
		return plus;
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
