package constructors;

import java.io.IOException;
import java.util.Scanner;

public class Student {

	public static Scanner scan=new Scanner(System.in);

	public Student(String adi, String soyadi, int yas, char cins, boolean okuyorMu) throws IOException {

	
	System.out.println("Lütfen yeni bir isim giriniz: ");
    adi=scan.next();
	
    System.out.println("Lütfen yeni bir soyisim giriniz: ");
    soyadi=scan.next();
	
	System.out.println("yaþý güncelleyin");
	yas=scan.nextInt();


	System.out.println("cinsiyeti güncelleyin");
	cins=scan.next().charAt(0);
	
	System.out.println("ögrenim durumunu güncelle");
	
	try {
		okuyorMu=scan.nextBoolean();
	} catch ( Exception e) {
		System.out.println("false veya true giriniz.");
	}
	
	

	
	
	
	}
	
	
	
	
	

}
