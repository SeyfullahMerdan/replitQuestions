package scanner;

import java.util.Scanner;

public class Q05 {

	@SuppressWarnings({ "static-access", "resource" })
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütffen integer türünde bir sayý girin: ");
		int sayi=scan.nextInt();
		
		
		Integer deger=sayi;

		
		System.out.println(deger.MAX_VALUE);
		System.out.println(deger.MIN_VALUE);

		
		
	
	}

}
