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
		System.out.println("Oyunu ba�latmak i�in bir kelime giriniz: "); // ana
		this.kelime = scan.next();
		puan1+=kelime.length();

	}

	@SuppressWarnings("static-access")
	public void ikinciOyuncu(String kelime) {

		System.out.println("\nOYUNCU 2-->");
		System.out.println("\nGirilen kelime: " + this.kelime + "\n");
		System.out.println(" Girilen kelime ge�erli mi?" + "Ge�erli: 1'e BAS\nGe�ersiz: 2'ye BAS");
		int secim = scan.nextInt();

		switch (secim) {

		case 1:

			harfEklemeMethodu(this.kelime);
			puan2 += this.kelime.length();
			birinciOyuncu(this.kelime);

			break;
		case 2:

			System.out.println("Ge�ersiz Kelime. Birinci oyuncu kazand�.");
			System.out.println("Birinci Oyuncunun Puan�: " + (puan1));
			break;

		default:
			System.out.println("Yanl�� giri� tu�lad�n�z.");
			ikinciOyuncu(kelime);
			break;
		}

	}

	@SuppressWarnings("static-access")
	private void birinciOyuncu(String kelime) {

		System.out.println("\nOYUNCU 1-->");
		System.out.println("\nGirilen kelime: " + this.kelime + "\n");
		System.out.println(" Girilen kelime ge�erli mi?" + "Ge�erli: 1'e BAS\nGe�ersiz: 2'ye BAS");
		int secim = scan.nextInt();

		switch (secim) {

		case 1:

			harfEklemeMethodu(this.kelime);
			puan1 += this.kelime.length();
			ikinciOyuncu(this.kelime);

			break;
		case 2:

			System.out.println("Ge�ersiz Kelime. �kinci oyuncu kazand�");
			System.out.println("�kinci Oyuncunun Puan�: " + (puan2));

			break;

		default:
			System.out.println("Yanl�� giri� tu�lad�n�z.");
			birinciOyuncu(kelime);
			break;
		}

	}

	@SuppressWarnings("static-access")
	private void harfEklemeMethodu(String kelime) {

		System.out.println("Kelimeye eklemek i�in bir harf giriniz: ");
		harf = scan.next().charAt(0);
		System.out.println("Kelimenin ba��na eklemek i�in B , kelimenin sonuna eklemek i�in S tu�lay�n�z: ");
		char tus = scan.next().toUpperCase().charAt(0);

		switch (tus) {
		case 'B':
			this.kelime = harf + kelime;
			System.out.println("Yeni olu�an kelime: " + this.kelime);
			break;
		case 'S':
			this.kelime = kelime + harf;
			System.out.println("Yeni olu�an kelime: " + this.kelime);

			break;

		default:
			System.out.println("Yanl�� giri� tu�lad�n�z.");
			harfEklemeMethodu(this.kelime);
			break;
		}

	}

}
