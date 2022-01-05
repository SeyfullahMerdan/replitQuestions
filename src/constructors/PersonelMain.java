package constructors;

public class PersonelMain {

	/*
	 * Create 2 constructors one is with parameters, the other one is without
	 * parameter. By using that constructors create at least 2 objects then print
	 * their features on the console.
	 */
	

    public static void main(String[] args) {
		
    	Personel company=new Personel() ;
    
    	Personel person=new Personel("jack" , 30, "personel", 'E') ; 

   
    	System.out.println(company.name + " " +  company.age + " " + company.job + " " + company.gender);
    	
    	System.out.println(person.name + " " + person.age + " " + person.job + " " + person.gender);
    
	}


}
