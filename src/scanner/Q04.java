package scanner;

import java.util.Scanner;

public class Q04 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		/*
		 * Kullan�c�ya g�nde ne kadar �ay i�ti�ini ve ne kadar �eker kulland���n� sorun.
		 * Y�lda ka� kg �eker kulland���n� hesaplay�n ve yazd�r�n.
		 * 1 �eker = 1.7 gr
		 * �rnek ��kt�:         1 kg = 1000 gram ise..
		 * Y�lda 12.41 kg �eker kullan�yor. 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Ne kadar �ay i�iyorsunuz? ");
		int cay=scan.nextInt();

		System.out.println("Ne kadar seker kullan�yorsunuz? ");
		int seker=scan.nextInt();

	    double userGram = (365*cay*seker*1.7) ;

	    
		double toplamKilo = (userGram/1000) ;
		
		
		System.out.println("Yilda " + toplamKilo + " kg seker kullaniyor.");
		
		
		
		
	}

}
