package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		 * Write a return method to reverse number.
		 * Input : 12345
		 * Output : 54321
		 */
		
		
		Scanner scan=new Scanner(System.in);
     	System.out.println("Lütfen Arrayin uzunlugunu belirleyin");
		int arru=scan.nextInt();
     	
		int arr[]= new int [arru];
     	
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Lütfen Arrayin "+ (i+1) +"'inci elemanýný giriniz: ");
			arr[i]=scan.nextInt();
		}

	
		
        int arrReverse[]= new int [arr.length];
		
        int index=0;
		
		for (int i =arr.length-1 ; i>= 0; i--) {
		
		arrReverse[index] = arr[i]; 
		index++;	
		
		}
		
		System.out.print( "Array :" + Arrays.toString(arrReverse) );
		
		
		
		System.out.println();
		System.out.println("Elemanlar : ");
		
		for (int i=0 ; i<=arrReverse.length-1 ; i++) {
		    System.out.print(  arrReverse[i]   );
					
		    }
		
		
		
		

	}

}
