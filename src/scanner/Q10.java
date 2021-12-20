package scanner;

import java.util.Scanner;

public class Q10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan dakika girmesini isteyin, Dakikalarý birkaç yýl ve gün sayýsýna
		 * dönüþtürmek için bir Java programý yazýn.
		 * INPUT:
		 * Dakika sayýsý: 3456789
		 * OUTPUT :
		 * 3456789 dakika yaklaþýk 6 yýl 210 gündür 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen dakika sayýsý giriniz: ");
		int dakika = scan.nextInt();

		int gunDakika = 24 * 60;
		int yilDakika = 365 * gunDakika;

		int artanGun = (dakika % yilDakika) / gunDakika;

		System.out.println(dakika / yilDakika);

		System.out.println(dakika + " dakika yaklasik " 
		                           + dakika / yilDakika + " yil " + artanGun + " gundur");		
		
		
		
		
		
		
		
		
		
	}

}
