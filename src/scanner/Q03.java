package scanner;

import java.util.Scanner;

public class Q03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Kullan�c�dan dikd�rtgenin kenar uzunluklar�n� al�n ve dikd�rtgenin alan�n� ve
		 * �evresini konsola yazd�ran bir program yaz�n.
		 * �rnek ��kt�:
		 * Alan: 32    
		 * �evre: 24  
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen dikt�rgenin 2 farkl� kenar uzunluklar�n� giriniz ");
		int uzunluk1=scan.nextInt();
		int uzunluk2=scan.nextInt();
		
		
		System.out.println("Girdiginiz dikt�rgenin Alani: "+ (uzunluk1*uzunluk2));
		System.out.println("Girdiginiz dikt�rgenin Cevresi: "+2*(uzunluk1+uzunluk2));

		
		
		
		
		
		
		
		
		
	}

}
