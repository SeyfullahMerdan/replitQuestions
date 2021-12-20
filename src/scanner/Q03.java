package scanner;

import java.util.Scanner;

public class Q03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Kullanýcýdan dikdörtgenin kenar uzunluklarýný alýn ve dikdörtgenin alanýný ve
		 * çevresini konsola yazdýran bir program yazýn.
		 * Örnek Çýktý:
		 * Alan: 32    
		 * Çevre: 24  
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen diktörgenin 2 farklý kenar uzunluklarýný giriniz ");
		int uzunluk1=scan.nextInt();
		int uzunluk2=scan.nextInt();
		
		
		System.out.println("Girdiginiz diktörgenin Alani: "+ (uzunluk1*uzunluk2));
		System.out.println("Girdiginiz diktörgenin Cevresi: "+2*(uzunluk1+uzunluk2));

		
		
		
		
		
		
		
		
		
	}

}
