package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
		 * write a Java program to removes a specific element from an array and put the
		 * remaining elements in a new array and prints the new array
		
		 * Input :{1,2,3,4,5,6}

		 * element:6

		 * Output : [1,2,3,4,5]
		 */
		
		
		
		int arr1[]={ 1,2,3,4,5,6  } ;
		int arr2[]=new int [arr1.length-1];
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("write a elements");
		int elm=scan.nextInt();
		
		
		for (int i = 0; i < arr2.length; i++) {
		
			if ( ! (arr1[i]==elm)    ) {
				arr2[i]=arr1[i];
			} 
		}
		
		
		
		List <Integer> list=new ArrayList <> ();
		
		for (int i = 0; i < arr2.length; i++) {
			list.add(arr2[i]);
		}
		
		
		System.out.println((list));
		
		
		
		
	}

}
