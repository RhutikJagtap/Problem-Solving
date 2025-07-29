package array.basic;

/*Given a string s consisting of only '0's and '1's,  find the last index of the '1' present.

Note: If '1' is not present, return "-1"

Examples:

Input: s = 00001
Output: 4
Explanation: Last index of  1 in given string is 4.
Input: s = 0
Output: -1
Explanation: Since, 1 is not present, so output is -1.*/
public class LastIndexOfOne {

	public static int lastIndex(String s) {

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				return i;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		String s = "00001";

		int result = lastIndex(s);
		System.out.println(result);
	}

}
