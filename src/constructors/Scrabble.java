package constructors;

public class Scrabble {
	
	@SuppressWarnings({ })
	public static void main(String[] args) {

		
		Oyuncu oyuncular=new Oyuncu();
		
		
		oyuncular.oyunuBaslat();
		oyuncular.ikinciOyuncu(Oyuncu.kelime);
		
	

	}


	
}
