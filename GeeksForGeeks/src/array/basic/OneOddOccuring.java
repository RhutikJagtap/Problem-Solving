package array.basic;

import java.util.Arrays;

/*Given an array of arr[] positive integers where all numbers occur even number of times
 *  except one number which occurs odd number of times. 
 * Return that number.

Examples:

Input:arr[] = [1, 2, 3, 2, 3, 1, 3]
Output: 3
Explaination: 3 occurs three times.

Input:arr[] = [5, 7, 2, 7, 5, 2, 5]
Output: 5
Explaination: 5 occurs three times.*/
public class OneOddOccuring {

	// O(n^2)
	static int getOddOccurrence(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return arr[i];
			}
		}

		return -1;
	}

	// O(n)
	static int getOddOccurrence2(int[] arr) {

		Arrays.sort(arr);

		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else if (count % 2 != 0) {
				return arr[i];
			} else {
				count = 1;
			}
		}

		if (count % 2 != 0) {
			return arr[arr.length - 1];
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 2, 7, 5, 2, 5 };

		int result = getOddOccurrence2(arr);
		System.out.println(result);
	}

}
