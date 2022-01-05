package constructors;

import java.util.Scanner;

public class Oyuncu {

	static Scanner scan = new Scanner(System.in);
	static String kelime = "";
	char harf = 'a';

	static int puan1 = 0;
	static int puan2 = 0;
	
	@SuppressWarnings("static-access")
	public void oyunuBaslat() {

		System.out.println("OYUNCU 1-->");
		System.out.println("Oyunu baþlatmak için bir kelime giriniz: "); // ana
		this.kelime = scan.next();
		puan1+=kelime.length();

	}

	@SuppressWarnings("static-access")
	public void ikinciOyuncu(String kelime) {

		System.out.println("\nOYUNCU 2-->");
		System.out.println("\nGirilen kelime: " + this.kelime + "\n");
		System.out.println(" Girilen kelime geçerli mi?" + "Geçerli: 1'e BAS\nGeçersiz: 2'ye BAS");
		int secim = scan.nextInt();

		switch (secim) {

		case 1:

			harfEklemeMethodu(this.kelime);
			puan2 += this.kelime.length();
			birinciOyuncu(this.kelime);

			break;
		case 2:

			System.out.println("Geçersiz Kelime. Birinci oyuncu kazandý.");
			System.out.println("Birinci Oyuncunun Puaný: " + (puan1));
			break;

		default:
			System.out.println("Yanlýþ giriþ tuþladýnýz.");
			ikinciOyuncu(kelime);
			break;
		}

	}

	@SuppressWarnings("static-access")
	private void birinciOyuncu(String kelime) {

		System.out.println("\nOYUNCU 1-->");
		System.out.println("\nGirilen kelime: " + this.kelime + "\n");
		System.out.println(" Girilen kelime geçerli mi?" + "Geçerli: 1'e BAS\nGeçersiz: 2'ye BAS");
		int secim = scan.nextInt();

		switch (secim) {

		case 1:

			harfEklemeMethodu(this.kelime);
			puan1 += this.kelime.length();
			ikinciOyuncu(this.kelime);

			break;
		case 2:

			System.out.println("Geçersiz Kelime. Ýkinci oyuncu kazandý");
			System.out.println("Ýkinci Oyuncunun Puaný: " + (puan2));

			break;

		default:
			System.out.println("Yanlýþ giriþ tuþladýnýz.");
			birinciOyuncu(kelime);
			break;
		}

	}

	@SuppressWarnings("static-access")
	private void harfEklemeMethodu(String kelime) {

		System.out.println("Kelimeye eklemek için bir harf giriniz: ");
		harf = scan.next().charAt(0);
		System.out.println("Kelimenin baþýna eklemek için B , kelimenin sonuna eklemek için S tuþlayýnýz: ");
		char tus = scan.next().toUpperCase().charAt(0);

		switch (tus) {
		case 'B':
			this.kelime = harf + kelime;
			System.out.println("Yeni oluþan kelime: " + this.kelime);
			break;
		case 'S':
			this.kelime = kelime + harf;
			System.out.println("Yeni oluþan kelime: " + this.kelime);

			break;

		default:
			System.out.println("Yanlýþ giriþ tuþladýnýz.");
			harfEklemeMethodu(this.kelime);
			break;
		}

	}

}
