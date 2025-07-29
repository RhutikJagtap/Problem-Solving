package array.basic;

/*You are given an integer n. You need to convert all zeroes of n to 5.

Examples:

Input: n = 1004
Output: 1554
Explanation: There are two zeroes in 1004 on replacing all zeroes with 5, the new number will be 1554.
Input: n = 121
Output: 121
Explanation: Since there are no zeroes in 121, the number remains as 121.*/
public class ReplaceAll0sWith5 {
	static int convertfive(int num) {

		if (num == 0) {
			return 5;
		}

		int result = 0;
		int place = 1;
		while (num > 0) {
			int lastDigit = num % 10;
			if (lastDigit == 0) {
				lastDigit = 5;
			}
			result = result + lastDigit * place;
			place = place * 10;
			num = num / 10;
		}

		return result;
	}

	public static void main(String[] args) {
		int num = 1004;
		int result = convertfive(num);
		System.out.println(result);
	}

}
