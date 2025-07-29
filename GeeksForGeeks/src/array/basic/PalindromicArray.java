package array.basic;

/*Given an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return false.

Examples:

Input: arr[] = [111, 222, 333, 444, 555]
Output: true
Explanation:
arr[0] = 111, which is a palindrome number.
arr[1] = 222, which is a palindrome number.
arr[2] = 333, which is a palindrome number.
arr[3] = 444, which is a palindrome number.
arr[4] = 555, which is a palindrome number.
As all numbers are palindrome so This will return true.

Input: arr[] = [121, 131, 20]
Output: false
Explanation: 20 is not a palindrome hence the output is false.*/
public class PalindromicArray {

	static int reverseNumber(int n) {
		int rev = 0;

		while (n > 0) {
			int lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n = n / 10;
		}
		return rev;
	}

	static boolean isPalindrome(int n) {
		int reverse = reverseNumber(n);
		if (reverse == n) {
			return true;
		}

		return false;
	}

	public static boolean isPalinArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (isPalindrome(arr[i]) == false) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 121, 131, 20 };

		boolean result = isPalinArray(arr);
		System.out.println(result);
	}

}
