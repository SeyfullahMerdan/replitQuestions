package list;

import java.util.Scanner;

public class Q05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Write a program that accepts an integer as input and prints first 10 prime
		 * numbers greater than input Check numbers if they are even or not in a return
		 * method.
		 * 
		 * Input : 5
		 * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 */

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen pozitif bir sayý giriniz: ");
		
		int sayi=scan.nextInt();
	
		int bolen=0;
	
		for (int j = sayi+1 ; j < 50; j++) {
			
		for (int i = 2; i <= j ; i++) {
			
			if (j%i==0) {
				bolen++;
			}
			
		}
		
		if (bolen==1) {
			System.out.println( j + " bir asal sayýdýr.");
		} else {
			// System.out.println( j + " asal sayý degildir.");
		}
		
		bolen=0;
	
		}
		
	
		
		
	}
}
