package array.basic;

import java.util.ArrayList;
import java.util.List;

/*
Given an array arr[] of integers. 
The problem is finding the longest contiguous subarray's length 
such that every element is strictly greater than its previous element in the same subarray.

Examples:

Input: arr[] = [5, 6, 3, 5, 7, 8, 9, 1, 2]
Output: 5
Explanation: here the subarray arr[2:6] = [3, 5, 7, 8, 9] is longest subarray to follow strictly increasing order.

Input: arr[] = [12, 13, 1, 5, 4, 7, 8, 10, 10, 11]
Output: 4
Explanation: here the subarray arr[4:7] = [4, 7, 8, 10] is longest subarray to follow strictly increasing order.
*/
public class LongestIncreasingSubarray {

	public static int lenOfLongIncSubArr(List<Integer> arr) {
		int longestLength = 0;

		int currentLength = 1;
		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(i - 1) < arr.get(i)) {
				currentLength++;
			} else {
				longestLength = Math.max(longestLength, currentLength);

				currentLength = 1;
			}
		}

		longestLength = Math.max(longestLength, currentLength);

		return longestLength;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(8);
		list.add(10);
		list.add(10);
		list.add(11);

		int length = lenOfLongIncSubArr(list);
		System.out.println(length);
	}
}
