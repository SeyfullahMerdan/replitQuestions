package if_Switch_Ternary_StringsMethods;

import java.util.Scanner;

public class Q08 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim girmesini isteyin ve son 2 harfinin 3 kopyas�ndan
		 * olu�an yeni bir String yazd�r�n
		 * 
		 * Kullanicidan alinan isim uzunlu�u en az 2 olacakt�r.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir isim giriniz\nisim uzunlugu en az 2 karakter olmal�d�r: ");
		String isim=scan.nextLine();
		
		String isimY="";
		
		for (int i = 0; i <= 2; i++) {
		   isimY += isim.substring(isim.length()-2);
		}
		
		System.out.println(isimY);
		
	}

}
