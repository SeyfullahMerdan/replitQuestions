package scanner;

import java.util.Scanner;

public class Q02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	/*	Kullanýcýdan karenin kenar uzunluðunu alýn ve karenin alanýný ve çevresini konsola yazdýran bir program yazýn.

		Ornek Cikti :

		Alan: 9

		Cevre: 12  */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen karenin kenar uzunlugunu giriniz: ");
		int kenar=scan.nextInt();

		System.out.println("Alan: "+kenar*3);
		System.out.println("Cevre: "+kenar*4);


	}

}
