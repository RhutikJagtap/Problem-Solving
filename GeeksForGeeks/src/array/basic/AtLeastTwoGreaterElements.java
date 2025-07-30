package array.basic;

import java.util.Arrays;

/*Given an array arr of distinct elements, the task is to return an array of all elements except the two greatest elements in sorted order.

Examples:

Input: arr[] = [2, 8, 7, 1, 5]
Output: [1, 2, 5] 
Explanation: Here we return an array contains 1 , 2, 5 and we leave two greatest elements 7 & 8.
 
Input: arr[] = [7, -2, 3, 4, 9, -1]
Output: [-2, -1, 3, 4]
Explanation: Here we return an array contains -2 , -1, 3, 4 and we leave two greatest elements 7 & 9. */
public class AtLeastTwoGreaterElements {

	public static long[] findElements(long arr[]) {
		Arrays.sort(arr);
		long[] res = new long[arr.length - 2];

		for (int i = 0; i < res.length; i++) {
			res[i] = arr[i];
		}
		return res;

	}

	public static void main(String[] args) {
		long[] arr = { 2, 8, 7, 1, 5 };

		long[] res = findElements(arr);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
