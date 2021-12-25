package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * Write a program that deletes the letters 'a' from the names in the list given
		 * as input.
		 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"} 
		 *​ OUTPUT : ​ [Veli,Omer]
		 */
	
	
		List <String> list=new ArrayList <>(Arrays.asList( "Ali", "Veli", "Ayse", "Fatma", "Omer" )); 

		
		for (int i = 0; i < list.size(); i++) {
			
			for (int j = 0; j < list.get(i).length() ; j++) {
			
			     if (list.get(i).toString().toLowerCase().contains("a")) {
				list.remove(i);
			                     }
					
			
			}	
		}
		
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
	
	
	}

}
