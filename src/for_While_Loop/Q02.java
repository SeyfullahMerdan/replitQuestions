package for_While_Loop;

public class Q02 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM
		 * (Least Common Multiple)

		 * Input :
		 * 30 and 40
		
		 * Expected OutPut:
		 * GCD for 30 and 40 = 10
		 * LCM for 30 and 40 = 120
		 */
		
		
		int sayi1 = 30;
		int sayi2 = 40;

		int sayac = 1;
		int ebob = 1;
		int ekok = 1;

		while (sayac <= 30) { // 1 , 2 , 5, 10 ebob =10

			if (sayi1 % sayac == 0 && sayi2 % sayac == 0) {

				ebob = sayac;
			}

			sayac++;
		}

		System.out.println(ebob);

		while (sayac >= 0) {

			ekok = sayi1 * sayi2 / ebob;
			sayac++;
		}

		System.out.println(ekok);

	}

}
