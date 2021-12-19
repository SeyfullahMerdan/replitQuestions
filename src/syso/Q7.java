package syso;

public class Q7 {

	public static void main(String[] args) {

		/*
		 * Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)
		 * 
		 * int a= 3;
		 * 
		 * int b= 5;
		 * 
		 * Ornek Cikti:
		 * 
		 * a=5
		 * 
		 * b=3
		 * 
		 * 
		 */

		int a = 3;

		int b = 5;

		int c = 0;

		c = a;
		a = b;
		b = c;

		c = 0;

		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
