package array;

public class Q3 {

	public static void main(String[] args) {
		/*
		 * Write a method which accepts a String as parameter and prints the sum of the
		 * digits, present in the given string.
	
		 * input : ade1r4d3
		 * output : 8
         Hint : Use Character.isDigit()
		 Integer.valueOf()
		 */	
		
		String str="ade1r4d3";

		sum(str);
		
	}

	private static void sum (String str) {

		
	    String str1=str;
		String str2="";
	
		
		for (int i = 0; i < str1.length(); i++) {
		   
		if (Character.isDigit(str1.charAt(i))) {
		         str2+=str.charAt(i);
			}
		}
		
		String arr[] = str2.split("");
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
		toplam+= Integer.valueOf(arr[i]);	
			
		}
		
		System.out.println(toplam);	
		
		
	}

}
