package array.basic;

/*Given an array, arr of n integers, and an integer element x, find whether element x is present in the array. 
 * Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.

Examples:

Input: arr[] = [1, 2, 3, 4], x = 3
Output: 2

Input: arr[] = [10, 8, 30, 4, 5], x = 5
Output: 4
*/
public class ArraySearching {

	static int search(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {10, 8, 30, 4, 5};
		
		int target=5;
		
		int index = search(arr,target);
		System.out.println(index);
	}

}
