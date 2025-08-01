package array.easy;

import java.util.ArrayList;

/*You are given a sorted array arr[] containing positive integers. Your task is to remove all duplicate elements from this array such that each element appears only once.
Return an array containing these distinct elements in the same order as they appeared.
Examples :

Input: arr[] = [2, 2, 2, 2, 2]
Output: [2]
		
Input: arr[] = [1, 2, 4]
Output: [1, 2, 4]
*/

public class RemoveDuplicatesSortedArray {

	static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				list.add(arr[i]);
			}
		}
		list.add(arr[arr.length - 1]);

		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2 };

		ArrayList<Integer> al = removeDuplicates(arr);
		System.out.println(al);
	}

}
