package constructorTeamW;

import java.io.IOException;

public class StudentMain {

	
	public static void main(String[] args) throws IOException {
		
		String adi="Ahmet";
		String soyadi="Aslan";
		int yas=30;
		char cins='k';
		boolean okuyorMu=true;
		
			
		Studentt s1=new Studentt(adi , soyadi , yas , cins, okuyorMu);	
			
		System.out.println( s1.adi + " " + s1.soyadi + " " + s1.cins );
		
		
		

	}

}
