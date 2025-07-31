package array.basic;

import java.util.Arrays;

/*
Given an array of elements occurring in multiples of k, except one element which doesn't occur in multiple of k. Return the unique element.

Examples:

Input: k = 3, arr[] = [6, 2, 5, 2, 2, 6, 6]
Output: 5
Explanation: Every element appears 3 times except 5.

Input: k = 4, arr[] = [2, 2, 2, 10, 2]
Output: 10
Explanation: Every element appears 4 times except 10.*/

public class FindUniqueElement {

	public static int findUnique(int k, int[] arr) {
		Arrays.sort(arr);

		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				if (count % k != 0) {
					return arr[i];
				}
				count = 1;
			}
		}

		return arr[arr.length - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2, 10, 2 };

		int k = 4;

		int result = findUnique(k, arr);
		System.out.println(result);
	}

}
