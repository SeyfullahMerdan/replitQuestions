package scanner;

import java.util.Scanner;

public class Q9 {

	/*
	 * Girilen zaman� saniyeye �eviren bir program yaz�n�z.
	 * �rnek ��kt�:
	 * 1 saat 10 dakika 50 saniye ==>
	 * 4250 saniye
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen saati giriniz");
		int saat=scan.nextInt();

		System.out.println("L�tfen dakikay� giriniz");
		int dakika=scan.nextInt();

		System.out.println("L�tfen saniyeyi giriniz");
		int saniye=scan.nextInt();

		System.out.println("Girilen zaman�n saniyesi: " 
		+  ((saat*60*60)+(dakika*60)+saniye) + " saniye" );                               
		

	}

}
