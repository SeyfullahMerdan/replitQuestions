package constructorTeamW;

public class PersonelMain {

	public static void main(String[] args) {

		
		Personel person1=new Personel();
		Personel person2=new Personel( "Ahmet" , "Aslan" , "QA" , 30 , 'e' , true );
		
		
		System.out.println(person2.isim + " "  + person2.soyisim + " " + person2.meslek);
		System.out.println(person1.isim + " "  + person1.soyisim + " " + person1.meslek);

		
		
		
	}

}
