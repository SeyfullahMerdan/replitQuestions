package if_Switch_Ternary_StringsMethods;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		/*
		 * Ask user to their weight and height and type a program with calculates mass
		 * index
		 * HINT : Body Mass Index = Weight (kg) / Square of height (m) Then give a
		 * message to user as following:
		 * If BMI is less than 18.5 , you re weak If BMI is between 18.5 and 25 , your
		 * weight is ideal If BMI is between 25 and 30, you re fat If BMI is more than
		 * or equal to 30, obese

		 * EXAMPLE :
		 * INPUT:
		 * Weight : 71
		 * Height : 1,72
		 * 
		 * OUTPUT :
		 * Your BMI is : 23.99945916711736 Your weight is ideal
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("To see your mass index write your weight: ");
		double w=scan.nextDouble();
		System.out.println("To see your mass index write your height: ");
		double h=scan.nextDouble();
		
		double bmi=w/(h*h);
		System.out.println("\nYour BMI: " + bmi);
		
		if (bmi<=0) {
			System.out.println("invalid login");
		} else if (bmi<18.5) {
			System.out.println("You are weak");
		} else if (bmi >=18.5 && bmi<25 ) {
            System.out.println("your weight is ideal");
		} else if ( bmi >=25 && bmi<30  ) {
            System.out.println("you re fat");
		} else {
            System.out.println("you re obese man!Take care ur self! :)");
		}
	
		
		scan.close();
		
	}

}
