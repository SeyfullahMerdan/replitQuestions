package if_Switch_Ternary_StringsMethods;

import java.time.LocalDate;
import java.util.Scanner;

public class Q05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Write a Java program to find the number of days in a month.(Use Switch Case)
		 * (Interview Question / Leak Year)
		 * 
		 * Sample: ​ INPUT: ​ Input a month number: 2 ​ Input a year: 2016 ​ OUTPUT : ​
		 * February 2016 has 29 days
		 */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input a month number: ");
		int m=scan.nextInt();
		
		System.out.println("Input a year: ");
		int y=scan.nextInt();
		
		
		switch (m) {
		case 1:
			System.out.println("January has a 31 days");
			break;
		case 2:
			leakyear(y,m);
			break;
		case 3:
			System.out.println("March has a 31 days");
			break;	
		case 4:
			System.out.println("April has a 30 days");
			break;
		case 5:
			System.out.println("Mai has a 31 days");
			break;
		case 6:
			System.out.println("Juni has a 30 days");
			break;
		case 7:
			System.out.println("Juli has a 31 days");
			break;
		case 8:
			System.out.println("August has a 31 days");
			break;
		case 9:
			System.out.println("October has a 30 days");
			break;
		case 10:
			System.out.println("September has a 31 days");
			break;
		case 11:
			System.out.println("November has a 30 days");
			break;
		case 12:
			System.out.println("December has a 31 days");
			break;	
		default:
			System.out.println ("Invalid entry!");
			break;
		}
		scan.close();
	}

	
	private static void leakyear(int y, int m) {
		
		LocalDate d=LocalDate.of(y, m, 1);
		if (d.isLeapYear()==true) {
			System.out.println("February " + y + " has 29 days.Leap year");
		} else {
			System.out.println("February " + y + " has 28 days.Not a leap year");
		}
		
   	}


	
}
