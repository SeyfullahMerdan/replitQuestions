package if_Switch_Ternary_StringsMethods;

import java.util.Scanner;

public class Q08 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasýndan
		 * oluþan yeni bir String yazdýrýn
		 * 
		 * Kullanicidan alinan isim uzunluðu en az 2 olacaktýr.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz\nisim uzunlugu en az 2 karakter olmalýdýr: ");
		String isim=scan.nextLine();
		
		String isimY="";
		
		for (int i = 0; i <= 2; i++) {
		   isimY += isim.substring(isim.length()-2);
		}
		
		System.out.println(isimY);
		
	}

}
