package scanner;

import java.util.Scanner;

public class Q9 {

	/*
	 * Girilen zamaný saniyeye çeviren bir program yazýnýz.
	 * Örnek Çýktý:
	 * 1 saat 10 dakika 50 saniye ==>
	 * 4250 saniye
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen saati giriniz");
		int saat=scan.nextInt();

		System.out.println("Lütfen dakikayý giriniz");
		int dakika=scan.nextInt();

		System.out.println("Lütfen saniyeyi giriniz");
		int saniye=scan.nextInt();

		System.out.println("Girilen zamanýn saniyesi: " 
		+  ((saat*60*60)+(dakika*60)+saniye) + " saniye" );                               
		

	}

}
