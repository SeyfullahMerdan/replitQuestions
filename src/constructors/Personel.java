package constructors;

public class Personel {

	String name;
	int age;
	String job;
	char gender;

	Personel () {
		
		this.name= "New Epoch";
		this.gender = 'F';
		this.job= "Information Technologys";
		this.age=1935;
	 }

	Personel (String name, int age, String job, char gender) {
		
		this.name=name;
		this.age=age;
		this.job=job;
		this.gender=gender;
		
	}
	
	
 }
