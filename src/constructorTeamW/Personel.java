package constructorTeamW;

public class Personel {

	String isim="merve";
	String soyisim="çalýþkan";
	String meslek="dev";
	int yas=28;
	char cins='k';
	boolean calisiyorMu=true;
	
	
	Personel () {
	
		
	}

	
	
	
	
	public Personel(String ad, String soyad, String meslek, int i, char c, boolean b) {

		
		isim=ad;
		soyisim=soyad;
		this.meslek=meslek;
        yas=i;
		cins=c;
		calisiyorMu=b;
		
		
	}
	
	
	
	
	
}
