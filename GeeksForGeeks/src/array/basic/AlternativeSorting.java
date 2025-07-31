package array.basic;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an array arr of distinct integers. Rearrange the array in such a way that the first element is the largest and the second element is the smallest, the third element is the second largest and the fourth element is the second smallest, and so on.

Examples:

Input: arr[] = [7, 1, 2, 3, 4, 5, 6]
Output: [7, 1, 6, 2, 5, 3, 4]
Explanation: The first element is first maximum and second element is first minimum and so on.

Input: arr[] = [1, 6, 9, 4, 3, 7, 8, 2]
Output: [9, 1, 8, 2, 7, 3, 6, 4]
Explanation: The first element is first maximum and second element is first minimum and so on.
*/
public class AlternativeSorting {
	public static ArrayList<Integer> alternateSort(int[] arr) {
		Arrays.sort(arr);

		int i = 0;
		int j = arr.length - 1;

		ArrayList<Integer> list = new ArrayList<Integer>();

		while (i < j) {
			list.add(arr[j]);
			list.add(arr[i]);
			i++;
			j--;
		}

		// If odd length, add the middle element
		if (i == j) {
			list.add(arr[i]);
		}

		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 1, 2, 3, 4, 5, 6 };
		ArrayList<Integer> al = alternateSort(arr);

		System.out.println(al);

	}
}
