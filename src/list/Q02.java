package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {

	public static void main(String[] args) {
		
		/*
	
		 Create a 10-element list. Swap the 8th element with the 3rd element.

      INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

      Output:  [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		 
		 */
		
		List <String> list=new ArrayList <>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali")); 
		
		List <String> list2=new ArrayList <>(Arrays.asList(list.get(2))); // 3rd element i have put
		
		System.out.println("At the beginning list : " + list);
		
		list.set(2, list.get(7));		
		
		list.set(7, list2.get(0));
		
		System.out.println(" At the end list :      " + list);
		

	}

}
