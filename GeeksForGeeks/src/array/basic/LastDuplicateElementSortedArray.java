package array.basic;

/*
You are given a sorted array arr[] that may contain duplicate elements. 
Your task is to find the index of the last occurrence of any duplicate element
and return the index along with the value of that element. If no duplicate element is found, return [-1, -1].

Examples :

Input: arr[] = [1, 5, 5, 6, 6, 7]
Output: [4, 6]
Explanation: Last duplicate element is 6 having index 4.

Input: arr[] = [1, 2, 3, 4, 5]
Output: [-1, -1]
Explanation: No duplicate elements are present in the array.
*/
public class LastDuplicateElementSortedArray {

	public static int[] dupLastIndex(int[] arr) {
		int index = -1;
		int duplicateElement = -1;

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] == arr[i + 1]) {
				index = i + 1;
				duplicateElement = arr[i];
				break;
			}
		}

		return new int[] { index, duplicateElement };
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 5, 6, 6, 7 };

		int[] res = dupLastIndex(arr);
		System.out.println("[" + res[0] + " " + res[1] + "]");
	}
}
