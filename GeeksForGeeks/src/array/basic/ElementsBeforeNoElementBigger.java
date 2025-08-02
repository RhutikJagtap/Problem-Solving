package array.basic;

/*You are given an array arr[] of integers.
Your task is to find the count of elements before which all the elements are smaller. 
The first element is always counted as there are no elements before it.

Examples:

Input: arr[] = [10, 40, 23, 35, 50, 7]
Output: 3
Explanation: The elements 10, 40, and 50 are such that all preceding elements are smaller. Thus, the count is 3.

Input: arr[] = [5, 4, 1]
Output: 1
Explanation: Only the first element 5 is such that all preceding elements (none in this case) are smaller. Thus, the count is 1.
*/
public class ElementsBeforeNoElementBigger {

	public static int countElements(int[] arr) {
		if (arr.length == 0)
			return 0;

		int count = 1; // First element is always counted
		int maxSoFar = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxSoFar) {
				count++;
				maxSoFar = arr[i];
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 40, 23, 35, 50, 7 };

		int count = countElements(arr);
		System.out.println(count);
	}

}
