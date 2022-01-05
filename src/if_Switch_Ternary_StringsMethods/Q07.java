package if_Switch_Ternary_StringsMethods;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Create 2 words : name1 and name2
		 * 
		 * if the name1 has even numbers of characters,
		 * 
		 * then insert the second word in the middle of the first name
		 * 
		 * if the first word has odd numbers
		 * 
		 * Then print the “Name2 cannot be inserted in the name1”
		 * 
		 * e.g:
		 * 
		 * name1= mehmet
		 * 
		 * name2= ahmet
		 * 
		 * Print ==> mehahmetmet
		 */
		
		String name1= "meryem";
		String name2= "senem";
		
		if (name1.length()%2==0) {
			
			String name11= name1.substring(0,name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2));

			System.out.println(name11);
			
		} else {
			System.out.println("Name2 cannot be inserted in the name1");
		}
		
		
		
	
		
	
	}

}
