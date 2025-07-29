package array.basic;

/*Given an array arr[], print all its elements space-separated.

Note: You don't need to move to the next line after printing all elements of the array (space-separated)

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: 1 2 3 4 5

Input: arr[] = [2, 3, 5, 5]
Output: 2 3 5 5
*/
public class PrintElementsofArray {

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 5 };
		printArray(arr);
	}

}
