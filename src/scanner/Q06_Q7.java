package scanner;

import java.util.Scanner;

public class Q06_Q7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
	 Kullan�c� taraf�ndan girilen DOUBLE say�y� tam say�ya �eviren bir program yaz�n�z. 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tffen double t�r�nde bir say� girin: ");
		double sayi=scan.nextDouble();

		int sayi1= (int)sayi;
	    System.out.println("Girdiginiz say�n�n en son hali : " + sayi1);

	  
		// Kullan�c�dan bir Float de�er girmesini isteyin, bu say�y� short de�i�ken
		// tipine d�n��t�r�n ve konsolda yazd�r�n.
	    

		System.out.println("L�tfen float t�r�nde bir say� girin: ");
		float deger=scan.nextFloat();

		short sayiS= (short)deger;

	     System.out.println("Girdiginiz say�n�n en son hali : " + sayiS);

	}

}
