package constructors;

import java.io.IOException;
import java.util.Scanner;

public class Student {

	public static Scanner scan=new Scanner(System.in);

	public Student(String adi, String soyadi, int yas, char cins, boolean okuyorMu) throws IOException {

	
	System.out.println("L�tfen yeni bir isim giriniz: ");
    adi=scan.next();
	
    System.out.println("L�tfen yeni bir soyisim giriniz: ");
    soyadi=scan.next();
	
	System.out.println("ya�� g�ncelleyin");
	yas=scan.nextInt();


	System.out.println("cinsiyeti g�ncelleyin");
	cins=scan.next().charAt(0);
	
	System.out.println("�grenim durumunu g�ncelle");
	
	try {
		okuyorMu=scan.nextBoolean();
	} catch ( Exception e) {
		System.out.println("false veya true giriniz.");
	}
	
	

	
	
	
	}
	
	
	
	
	

}
