package list;

import java.util.Scanner;

public class Q08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Write a java program which accept a sentence as parameter, than reverses
		 * sentence by using StringBuilder and checks if sentence is palindrome or not
		 * (without case sensitivity).Use StringBuilder.
		
		 * Input :
		 * I love Java.
		 * 
		 * Output:
		 * Reversed sentence : avaJ evol I. It is not a palindrome"
	
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please write a sentence to see if it is a palindrome or not:");
		String sentence=scan.nextLine().toLowerCase().replaceAll("\\s", "");
		
		StringBuilder str = new StringBuilder(sentence);
		StringBuilder strRev=str.reverse();
		
		
		String sentenceR=strRev.toString();
	
		
		if (sentenceR.equalsIgnoreCase(sentence)) {
			System.out.println("This sentence \"" + sentence + "\" is a palindrome");
		} else {
			System.out.println("This sentence \"" + sentence + "\" is not a palindrome");
		}
		
		
		
	}

}
