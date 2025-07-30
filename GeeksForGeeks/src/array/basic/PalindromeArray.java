package array.basic;

/*Given an array arr, the task is to find whether the arr is palindrome or not.
If the arr is palindrome then return true else return false.

An array is said to be palindrome if its reverse array matches the original array. 

Examples:

Input: arr = [1, 2, 3, 2, 1]
Output: true

Input: arr = [1, 2, 3, 4, 5]
Output: false*/
public class PalindromeArray {

	public static boolean isPalindrome(int[] arr) {

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (arr[i] != arr[j]) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 2, 1};
		
		boolean result = isPalindrome(arr);
		System.out.println(result);
	}
}
