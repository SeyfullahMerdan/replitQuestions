package scanner;

import java.util.Scanner;

public class Q02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	/*	Kullan�c�dan karenin kenar uzunlu�unu al�n ve karenin alan�n� ve �evresini konsola yazd�ran bir program yaz�n.

		Ornek Cikti :

		Alan: 9

		Cevre: 12  */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen karenin kenar uzunlugunu giriniz: ");
		int kenar=scan.nextInt();

		System.out.println("Alan: "+kenar*3);
		System.out.println("Cevre: "+kenar*4);


	}

}
