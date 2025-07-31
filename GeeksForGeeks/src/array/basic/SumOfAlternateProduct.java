package array.basic;

import java.util.Arrays;

/*
Given an array arr of even size consisting of positive integers. 
After sorting the array, find the sum of the product of i-th element from starting and i-th element from last.

Examples:

Input: arr[] = [9, 2, 8, 4, 5, 7, 6, 0]
Output: 74
Explanation: Required sum can be obtained as 9*0 + 8*2 + 7*4 + 6*5 which is equal to 74.

Input: arr[] = [1, 2, 3, 4]
Output: 10
Explanation: array is already sorted 1*4 + 2*3 = 10
*/
public class SumOfAlternateProduct {
	public static int altProduct(int[] arr) {
		Arrays.sort(arr);

		int i = 0, j = arr.length - 1;
		int product = 1;
		int sum = 0;

		while (i < j) {
			product = arr[i] * arr[j];
			sum = sum + product;
			i++;
			j--;
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 2, 8, 4, 5, 7, 6, 0 };

		int result = altProduct(arr);
		System.out.println(result);
	}

}
