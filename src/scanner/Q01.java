package scanner;

import java.util.Scanner;

public class Q01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
// Kullan�c�dan bir say� al�n ve say�n�n k�p�n�n yar�s�n� konsola yazd�ran bir program yaz�n.		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen sayi giriniz");
		int sayi=scan.nextInt();

		System.out.println( (sayi*sayi*sayi)/2 );
	

	}

}
