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
		
		System.out.println("Lütfen yeni ismi giriniz: ");
		this.adi=scan.next();
		
		System.out.println("Lütfen yeni soyismi giriniz: ");
		this.soyadi=scan.next();
		
		
		System.out.println("Lütfen yasi giriniz: ");
		this.yas=scan.nextInt();
		
		
		System.out.println("Cinsiyeti giriniz: ");
		this.cins=scan.next().charAt(0);
		
		
		System.out.println("Ögrenim durumunu güncelleyiniz");
		
		try {
			this.okuyorMu = scan.nextBoolean();
		} catch (Exception e) {
			System.out.println("True veya False olarak giriþ yapmalýsýnýz.");
		}
		
		
	}
	
}
