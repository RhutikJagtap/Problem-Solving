package array.basic;

//Given an array arr[]. The task is to find the largest element and return it.

/*Examples:
Input: arr[] = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.
Input: arr[] = [5, 5, 5, 5]
Output: 5
Explanation: The largest element of the given array is 5.
Input: arr[] = [10]
Output: 10
Explanation: There is only one element which is the largest.
*/
public class LargestElementInArray {

	public static int largest(int[] arr) {
		// code here
		if (arr.length == 1) {
			return arr[0];
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

}
