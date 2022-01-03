package if_Switch_Ternary_StringsMethods;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		/*
		 * Ask user Name, Surname and credit card numbers than convert it to special
		 * form. (Initials for name and surname should be uppercase) (Check credit card
		 * number, if there aren’t 16 digit print “Invalid credit card number”
		 * Input :
		 * John White 1234234534561478
		 * Output :
		 * Name : J* W**
		 * CCN : ** ** **** 1478
		 */

		
		Scanner scan=new Scanner(System.in);
        
		System.out.println("Please text your name: ");
        String name=scan.next();
        
        System.out.println("Please text your surname: ");
        String surname =scan.next();
        
        System.out.println("Please give your credit card number without any space: ");
        String ccn=scan.next().trim();
        
        String nameFormat=name.substring(0,1).toUpperCase() + name.substring(1).replaceAll("\\w", "*");
        String surnameFormat=surname.substring(0,1).toUpperCase()+surname.substring(1).replaceAll("\\w", "*");
        String ccFormat= "**** **** **** " + ccn.substring(12);
        
        System.out.println("Name : " + nameFormat + " " + surnameFormat);
        System.out.println("CCN : " + ccFormat);
		
		scan.close();
		
		
		
		
		
	}
}
