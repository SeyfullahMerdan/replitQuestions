package scanner;

import java.util.Scanner;

public class Q08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	/*
	 * Kullan�c�dan �� basamakl� bir say� girmesini ve bu say�n�n basamaklar�n�n
	 * toplam�n� bulmas�n� isteyin.
	
	 * �rnek ��kt�:
	 * Verilen tamsay�n�n rakamlar� toplam� 10'dur.
	 */
		
		
		
		
		
		
		
		
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("L�tfen 3 basamakli sayi giriniz");
		int sayi=scan.nextInt();

		int toplam=0;

		toplam+=sayi%10;
		sayi=sayi/10;
		toplam+=sayi%10;
		sayi=sayi/10;
		toplam+=sayi%10;
		sayi=sayi/10;
		toplam+=sayi;



		System.out.println("Verilen tamsayinin rakamlari toplami "
		+ toplam + "'dur.");
	

	}

}
