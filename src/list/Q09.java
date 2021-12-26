package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q09 {

	public static void main(String[] args) {

		/*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string.(Ignore case sensitivity).
		 * 
		 * Input : Learning java is easy
		 * 
		 * Output: maximum occurring character is : a
		 */
		
		
		
        String testData=" Learning java is easy";
		
		testData=testData.replaceAll("\s", "").toLowerCase();  // I made all space together and ý made all letter small
		List <String> list=new ArrayList <>(Arrays.asList(testData.split(""))); 
		             //  learningjavaiseasy
       
		int count=0;
		int mcount=0;
		String occuring="";
		
		
		for (int i = 0; i < list.size(); i++) {
		    for (int j = i+1; j < list.size(); j++) {
		    	if ( list.get(i).equalsIgnoreCase(list.get(j))      ) {
		    		count++;        // Ýf equals count ll be 1 --- 	    		
				}	    	
			} 
	
		    
		    if (count>mcount) { 
				
		    	mcount=count;
		    	occuring=list.get(i);
		 	
			}
		    
		    count=0; 
		}
		
		
		System.out.println(occuring);
		
		
		
		
		
		
		
		
		
	}

}
