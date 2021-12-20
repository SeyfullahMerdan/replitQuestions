package scanner;

import java.util.Scanner;

public class Q06_Q7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
	 Kullanýcý tarafýndan girilen DOUBLE sayýyý tam sayýya çeviren bir program yazýnýz. 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütffen double türünde bir sayý girin: ");
		double sayi=scan.nextDouble();

		int sayi1= (int)sayi;
	    System.out.println("Girdiginiz sayýnýn en son hali : " + sayi1);

	  
		// Kullanýcýdan bir Float deðer girmesini isteyin, bu sayýyý short deðiþken
		// tipine dönüþtürün ve konsolda yazdýrýn.
	    

		System.out.println("Lütfen float türünde bir sayý girin: ");
		float deger=scan.nextFloat();

		short sayiS= (short)deger;

	     System.out.println("Girdiginiz sayýnýn en son hali : " + sayiS);

	}

}
