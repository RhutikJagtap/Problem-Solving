package array.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array arr[], swap the kth element from the beginning with the kth element from the end.

Note: 1-based indexing is followed.

Examples :

Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 3
Output: [1, 2, 6, 4, 5, 3, 7, 8]
Explanation: 3rd element from beginning is 3 and 3rd element from end is 6, so we replace 3 & 6.

Input: arr[] = [5, 3, 6, 1, 2], k = 2
Output: [5, 1, 6, 3, 2]
Explanation: 2nd element from beginning is 3 and from end is 1.*/
public class SwapKthElements {
	public static void swapKth(List<Integer> arr, int k) {
		int temp = arr.get(k - 1);
		arr.set(k - 1, arr.get(arr.size() - k));
		arr.set(arr.size() - k, temp);
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);

		int k = 3;

		swapKth(list, k);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
