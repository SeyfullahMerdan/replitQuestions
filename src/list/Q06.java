package list;

import java.util.ArrayList;
import java.util.List;

public class Q06 {

	public static void main(String[] args) {

		/*
		 * Write a program to find the common elements between two String Arrays
		 * (without case sensitivity)
		 * Input1 : {John,Brad,Ange,Sofia,Emily}
		 * Input2 : {sofia,brad,grace,emily,hazel}
		 * Output : [sofia,brad,emily]
		 */
		
		
		String arr1[]= { "John","Brad","Ange","Sofia","Emily"  } ;
		String arr2[]= { "sofia","brad","grace","emily","hazel"  } ;
		List <String> list = new ArrayList <> ();
		
		for (int i = 0; i < arr2.length; i++) {
			
			for (int j = 0; j < arr1.length; j++) {
				
				if ( arr1[i].equalsIgnoreCase(arr2[j])  ) {
					list.add(arr1[i]);
				}
				
			}
		
		}
		
		System.out.println(list.toString().toLowerCase());
		
	

		
	}

}
