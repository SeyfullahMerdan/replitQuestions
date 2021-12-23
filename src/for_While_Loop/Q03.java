package for_While_Loop;

import java.util.ArrayList;
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

		String str="Javaisalsoeasy";
		int sayac=0;
		// String kontrol= "abcdefghijklmnoprstuvxyzwq";
		String duplicate="";
		
		for (int i = 0; i < str.length()-1; i++) {   // j yi alacak altta tüm harflere bakacak
		                               // a yý alcak tüm harflere bakacak....
			for (int j = str.length()-1; 0 <= j; j--) {
				if ( str.charAt(i) == str.charAt(j) ) {
				    sayac++;
				}		
			}
			if (sayac>=2) {
				duplicate+= str.charAt(i); 
				 sayac=0;           }
			else {
				sayac=0;
			}
		}
			System.out.println(duplicate);  // aasasas
		 
			
			
			
			
			
		}
	}