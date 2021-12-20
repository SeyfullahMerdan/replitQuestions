package scanner;

import java.util.Scanner;

public class Q10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan dakika girmesini isteyin, Dakikalar� birka� y�l ve g�n say�s�na
		 * d�n��t�rmek i�in bir Java program� yaz�n.
		 * INPUT:
		 * Dakika say�s�: 3456789
		 * OUTPUT :
		 * 3456789 dakika yakla��k 6 y�l 210 g�nd�r 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen dakika say�s� giriniz: ");
		int dakika = scan.nextInt();

		int gunDakika = 24 * 60;
		int yilDakika = 365 * gunDakika;

		int artanGun = (dakika % yilDakika) / gunDakika;

		System.out.println(dakika / yilDakika);

		System.out.println(dakika + " dakika yaklasik " 
		                           + dakika / yilDakika + " yil " + artanGun + " gundur");		
		
		
		
		
		
		
		
		
		
	}

}
