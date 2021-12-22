package for_While_Loop;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a name and a character, then check how many times the
		 * character is repeated in the name using loops in the name e.g: char ch1= 'a'
		 * ; String name =“John came late" Expected Output: Number of a = 2
		 */

		char ch1 = 'a';

		String name = "John came late";

		int sayi = 0;

		int sayac = 0;

		while (sayi <= name.length() - 1) {

			if (name.charAt(sayi) == ch1) {
				sayac++;
			}
			sayi++;

		}
		System.out.println("number of a = " + sayac);

	}

}
