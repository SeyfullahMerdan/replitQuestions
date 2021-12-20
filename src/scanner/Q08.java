package scanner;

import java.util.Scanner;

public class Q08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	/*
	 * Kullanýcýdan üç basamaklý bir sayý girmesini ve bu sayýnýn basamaklarýnýn
	 * toplamýný bulmasýný isteyin.
	
	 * Örnek Çýktý:
	 * Verilen tamsayýnýn rakamlarý toplamý 10'dur.
	 */
		
		
		
		
		
		
		
		
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("Lütfen 3 basamakli sayi giriniz");
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
