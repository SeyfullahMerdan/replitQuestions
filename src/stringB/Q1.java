package stringB;

import java.util.Scanner;

public class Q1 {

    //	and checks if sentence is palindrome or not (without case sensitivity)
	//Eg : input : I love Java Output: "Reversed sentence : avaJ evol I . It is not a palindrome"	
	// Write a java program which accept a sentence as parameter, than reverses
	// sentence by using StringBuilder

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Sentence please:");
		String str=scan.nextLine().toLowerCase().replaceAll("\\s","");
		
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sbRev = new StringBuilder(str);
        sbRev.reverse();
		
		
		if (sb.compareTo(sbRev)==0) {
			System.out.println(sbRev + " >>> this sentence  " + "it is a palindrome");
		} else {
			System.out.println(sbRev + " >>> this sentence " +"it is not a palindrome");
		}

	}

}