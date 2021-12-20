package scanner;

import java.util.Scanner;

public class Q01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
// Kullanýcýdan bir sayý alýn ve sayýnýn küpünün yarýsýný konsola yazdýran bir program yazýn.		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen sayi giriniz");
		int sayi=scan.nextInt();

		System.out.println( (sayi*sayi*sayi)/2 );
	

	}

}
