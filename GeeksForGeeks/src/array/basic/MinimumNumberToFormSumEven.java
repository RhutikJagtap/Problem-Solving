package array.basic;

/*
Given an array arr[] of size N, the task is to add the minimum number to the array so that the sum of the array becomes even

Example 1:

Input: N = 8
arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
Output:  0
Explanation:  Sum of array is 36, so 
we add minimum number 0 to make the 
sum even.

Example 2:

Input: N = 9
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}
Output:  1
*/
public class MinimumNumberToFormSumEven {
	static long minNum(long A[], int N) {
		long sum = 0;

		for (int i = 0; i < A.length; i++) {
			sum = sum + A[i];
		}
		if (sum % 2 == 0) {
			return 0;
		}

		return 1;
	}

	public static void main(String[] args) {
		long[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int n = 9;

		long result = minNum(arr, n);
		System.out.println(result);
	}

}
