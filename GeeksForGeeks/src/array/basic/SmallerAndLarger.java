package array.basic;

/*Given a sorted array arr and a value target, return an array of size 2. 
 * The first value is the number of elements less than or equal to the target, 
 * and the second value is the number of elements greater than or equal to the target.

Examples:

Input: arr[] = [1, 2, 8, 10, 11, 12, 19],  target = 0
Output: 0, 7
Explanation: There are no elements less or equal to 0 and 7 elements greater to 0.

Input: arr[] = [1, 5, 8, 12, 12, 12, 19], target = 12
Output: 6, 4
Explanation: There are 6 elements less or equal to 12 and 4 elements greater or equal to 12.
*/
public class SmallerAndLarger {
	static int[] getMoreAndLess(int[] arr, int target) {
		int smallerCount = 0;
		int greaterCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= target) {
				smallerCount++;
			} 
			
			if (arr[i] >= target) {
	            greaterCount++;
	        }
		}

		return new int[] { smallerCount, greaterCount };
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 10, 11, 12, 19 };

		int target = 0;

		int[] res = getMoreAndLess(arr, target);
		System.out.println(res[0]+" "+res[1]);
	}
}
