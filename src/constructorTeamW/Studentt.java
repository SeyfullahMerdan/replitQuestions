package constructorTeamW;

import java.util.Scanner;

public class Studentt {

	static Scanner scan=new Scanner(System.in);
	String adi;
	String soyadi;
	int yas;
	char cins;
	boolean okuyorMu;
	
	public Studentt(String adi, String soyadi, int yas, char cins, boolean okuyorMu) {
		
		System.out.println("L�tfen yeni ismi giriniz: ");
		this.adi=scan.next();
		
		System.out.println("L�tfen yeni soyismi giriniz: ");
		this.soyadi=scan.next();
		
		
		System.out.println("L�tfen yasi giriniz: ");
		this.yas=scan.nextInt();
		
		
		System.out.println("Cinsiyeti giriniz: ");
		this.cins=scan.next().charAt(0);
		
		
		System.out.println("�grenim durumunu g�ncelleyiniz");
		
		try {
			this.okuyorMu = scan.nextBoolean();
		} catch (Exception e) {
			System.out.println("True veya False olarak giri� yapmal�s�n�z.");
		}
		
		
	}
	
}
