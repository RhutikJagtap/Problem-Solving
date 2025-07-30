package array.basic;

/*
Given an array of car numbers car[], an array of penalties fine[], and an integer value date. 
The task is to find the total fine which will be collected on the given date. The fine is collected from odd-numbered cars on even dates and vice versa.

Examples:

Input: date = 12, car[] = [2375, 7682, 2325, 2352], fine[] = [250, 500, 350, 200]
Output: 600
Explanation: The date is 12 (even), so we collect the fine from odd-numbered cars. 
The odd-numbered cars and the fines associated with them are as follows:
2375 -> 250
2325 -> 350
The sum of the fines is 250+350 = 600
Input: date = 8, car[] = [2222, 2223, 2224], fine[] = [200, 300, 400]
Output: 300*/
public class FindTheFine {

	static boolean isOdd(int n) {
		if (n % 2 != 0) {
			return true;
		}
		return false;
	}

	public static long totalFine(int date, int car[], int fine[]) {
		long totalfine = 0;

		if (date % 2 == 0) {
			for (int i = 0; i < car.length; i++) {
				if (isOdd(car[i])) {
					totalfine = totalfine + fine[i];
				}
			}
		} else {
			for (int i = 0; i < car.length; i++) {
				if (isOdd(car[i]) == false) {
					totalfine = totalfine + fine[i];
				}
			}
		}

		return totalfine;
	}

	public static void main(String[] args) {
		int date = 8;
		int[] car = { 2222, 2223, 2224 };
		int[] fine = { 200, 300, 400 };

		long total = totalFine(date, car, fine);
		System.out.println(total);
	}

}
