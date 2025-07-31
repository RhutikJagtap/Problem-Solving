package array.basic;

import java.util.ArrayList;

/*Given an unsorted array arr[] and two elements num1 and num2.
 The task is to count the number of elements that occur between the given elements (excluding num1 and num2). 
If there are multiple occurrences of num1 and num2, we need to consider the leftmost occurrence of num1 and the rightmost occurrence of num2.

Examples:

Input: arr[] = [4, 2, 1, 10, 6], num1 = 4, and num2 = 6
Output: 3
Explanation: We have an array [4, 2, 1, 10, 6] and num1 = 4 and num2 = 6. 
So, the left most index of num1 is 0 and rightmost index of num2 is 4. So, the total number of element between them is [2, 1, 10] So, answer is 3.
Input: arr[] = [3, 2, 1, 4], num1 = 2, and num2 = 4
Output: 1
Explanation: here in array [3, 2, 1, 4] only one element [1] occur betweeen 2 and 4, So, answer is 1.
*/
public class CountNumbersBetweenTwoElementsInArray {

	public static int getCount(ArrayList<Integer> arr, int num1, int num2) {
		int si = 0;
		int ei = 0;

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == num1) {
				si = i;
				break;
			}
		}

		for (int i = arr.size() - 1; i >= 0; i--) {
			if (arr.get(i) == num2) {
				ei = i;
				break;
			}
		}

		int count = 0;
		for (int i = si + 1; i < ei; i++) {
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(2);
		al.add(1);
		al.add(10);
		al.add(6);

		int num1 = 4;
		int num2 = 6;

		int count = getCount(al, num1, num2);
		System.out.println(count);
	}

}
