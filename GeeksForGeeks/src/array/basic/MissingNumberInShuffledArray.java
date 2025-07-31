package array.basic;

/*Given an array arr1. The contents of arr are copied into another array arr2 and numbers are shuffled. Also, one element is removed from arr2. 
The task is to find the missing element.

Examples:
Input: arr1[] = [4, 8, 1, 3, 7] and arr2[] = [7, 4, 3, 1]
Output: 8
Explanation: 8 is the only element missing from arr2.

Input: arr1[] = [12, 10, 15, 23, 11, 30] and arr2[] = [15, 12, 23, 11, 30]
Output: 10
Explanation: 10 is the only element missing from arr2.
*/
public class MissingNumberInShuffledArray {
	public static int findMissing(int[] arr1, int[] arr2) {

		int sum1 = 0;
		for (int i : arr1) {
			sum1 = sum1 + i;
		}

		int sum2 = 0;
		for (int j : arr2) {
			sum2 = sum2 + j;
		}

		return sum1 - sum2;
	}

	public static void main(String[] args) {
		int[] arr1 = { 4, 8, 1, 3, 7 };

		int[] arr2 = { 7, 4, 3, 1 };

		int result = findMissing(arr1, arr2);
		System.out.println(result);

	}

}
