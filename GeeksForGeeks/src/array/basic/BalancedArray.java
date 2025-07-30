package array.basic;

import java.util.ArrayList;
import java.util.List;

/*Given an array arr of even size, the task is to find a minimum value that can be added to an element so that the array becomes balanced. 
An array is balanced if the sum of the left half of the array elements is equal to the sum of the right half.

Examples :

Input: arr = [1, 5, 3, 2]
Output: 1
Explanation: Sum of first 2 elements is 1 + 5  = 6, Sum of last 2 elements is 3 + 2  = 5, To make the array balanced you can add 1.

Input: arr = [1, 2, 1, 2, 1, 3]
Output: 2
Explanation: Sum of first 3 elements is 1 + 2 + 1 = 4, Sum of last three elements is 2 + 1 + 3 = 6, To make the array balanced you can add 2.
*/
public class BalancedArray {

	public static int minValueToBalance(List<Integer> arr) {
		int mid = arr.size() / 2;

		int leftSum = 0;
		for (int i = 0; i < mid; i++) {
			leftSum = leftSum + arr.get(i);
		}

		int rightSum = 0;
		for (int i = mid; i < arr.size(); i++) {
			rightSum = rightSum + arr.get(i);
		}

		if (leftSum > rightSum) {
			return leftSum - rightSum;
		}

		return rightSum - leftSum;
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);

		int result = minValueToBalance(list);
		System.out.println(result);

	}

}
