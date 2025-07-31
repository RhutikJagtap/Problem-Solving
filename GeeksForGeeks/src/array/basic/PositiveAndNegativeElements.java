package array.basic;

import java.util.ArrayList;

/*
Given an array arr containing equal number of positive and negative elements, arrange the array such that every positive element is followed by a negative element.
Note: The relative order of positive and negative numbers should be maintained.

Examples:

Input: arr[] = [-1, 2, -3, 4, -5, 6]
Output: [2, -1, 4, -3, 6, -5]
Explanation: Positive numbers in order are 2, 4 and 6. Negative numbers in order are -1, -3 and -5. So the arrangement we get is 2, -1, 4, -3, 6 and -5.
Input: arr[] = [-3, 2, -4, 1]
Output: [2, -3, 1, -4] 
Explanation: The positive numbers are 2,1 and negetive numbers are -3, -4 */
public class PositiveAndNegativeElements {

	static ArrayList<Integer> arranged(ArrayList<Integer> arr) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		ArrayList<Integer> positive = new ArrayList<Integer>();
		ArrayList<Integer> negative = new ArrayList<Integer>();

		for (int num : arr) {
			if (num > 0) {
				positive.add(num);
			} else {
				negative.add(num);
			}
		}

		int k = 0;

		while (k < positive.size()) {
			result.add(positive.get(k));
			result.add(negative.get(k));
			k++;
		}

		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(2);
		al.add(-18);

		ArrayList<Integer> list = arranged(al);
		System.out.println(list);
	}

}
