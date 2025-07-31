package array.basic;

import java.util.Arrays;

/*You are given an array arr. Find the sum of distinct elements in an array.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: 15
Explanation: Distinct elements are 1, 2, 3, 4, 5. So sum is 15.

Input: arr[] = [5, 5, 5, 5, 5]
Output: 5
Explanation: Only Distinct element is 5. So sum is 5.*/

public class SumOfDistinctElements {

	static int findSum(int arr[]) {
        Arrays.sort(arr);
		int sum = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				sum = sum + arr[i];
			}
		}

		return sum + arr[arr.length - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 5, 5, 5, 5, 5 };

		int sum = findSum(arr);
		System.out.println(sum);
	}

}
