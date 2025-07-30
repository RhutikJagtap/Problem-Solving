package array.basic;

/*Given an array arr of non-negative integers, return the maximum product of two numbers possible.

Example:

Input: arr[] = [1, 4, 3, 6, 7, 0] 
Output: 42
Explanation: 6 and 7 have the maximum product.
Input: arr[] = [1, 100, 42, 4, 23]
Output: 4200
Explanation:  42 and 100 have the maximum product.*/
public class MaximumProductOfTwoNumbers {
	public static int maxProduct(int[] arr) {
		int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}

		return firstLargest * secondLargest;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 100, 42, 4, 23 };

		int result = maxProduct(arr);
		System.out.println(result);
	}
}
