package array.basic;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
Given an array arr of integers which may or may not contain duplicate elements. 
Your task is to remove duplicate elements.

Examples:

Input: arr[] = [1, 2, 3, 1, 4, 2]
Output: [1, 2, 3, 4]
Explanation: 2 and 1 have more than 1 occurence.
Input: arr[] = [1, 2, 3, 4]
Output: [1, 2, 3, 4]
Explanation: There is no duplicate element.
*/
public class RemoveDuplicatesFromUnsortedArray {

	static ArrayList<Integer> removeDuplicate(int arr[]) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

		for (int i : arr) {
			lhs.add(i);
		}

		return new ArrayList<Integer>(lhs);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };

		ArrayList<Integer> res = removeDuplicate(arr);
		System.out.println(res);
	}
}
