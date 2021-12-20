package scanner;

import java.util.Scanner;

public class Q04 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		/*
		 * Kullanýcýya günde ne kadar çay içtiðini ve ne kadar þeker kullandýðýný sorun.
		 * Yýlda kaç kg þeker kullandýðýný hesaplayýn ve yazdýrýn.
		 * 1 þeker = 1.7 gr
		 * Örnek Çýktý:         1 kg = 1000 gram ise..
		 * Yýlda 12.41 kg þeker kullanýyor. 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Ne kadar çay içiyorsunuz? ");
		int cay=scan.nextInt();

		System.out.println("Ne kadar seker kullanýyorsunuz? ");
		int seker=scan.nextInt();

	    double userGram = (365*cay*seker*1.7) ;

	    
		double toplamKilo = (userGram/1000) ;
		
		
		System.out.println("Yilda " + toplamKilo + " kg seker kullaniyor.");
		
		
		
		
	}

}
