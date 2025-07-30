package array.basic;

/*Given a sorted array arr consisting of 0s and 1s. 
The task is to find the index (0-based indexing) of the first 1 in the given array.

NOTE: If one is not present then, return -1.

Examples :

Input : arr[] = [0, 0, 0, 0, 0, 0, 1, 1, 1, 1]
Output : 6
Explanation: The index of first 1 in the array is 6.

Input : arr[] = [0, 0, 0, 0]
Output : -1
Explanation: 1's are not present in the array.
*/public class First1InSortedBinaryArray {

	public static long firstIndex(int arr[]) {

		int start = 0;
		int end = arr.length - 1;
		int result = -1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == 1) {
				result = mid;
				end = mid - 1;
			} else {
				start = mid + 1; // move right
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 };

		long index = firstIndex(arr);
		System.out.println(index);
	}

}
