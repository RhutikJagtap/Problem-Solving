package array.basic;

import java.util.ArrayList;
import java.util.List;

/*Given an unsorted array arr. Find the count of elements less than or equal to the given element x.

Examples:

Input: x = 9, arr = [10, 1, 2, 8, 4, 5] 
Output: 5
Explanation: The 5 elements are 1, 2, 8, 4 and 5.
Input: x = 2, arr = [1, 2, 2, 5, 7, 2, 9] 
Output: 4 
Explanation: The 4 elements are 1, 2, 2 and 2.*/
public class CountOfSmallerElements {
	public static int countOfElements(int x, List<Integer> arr) {
		int count = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) <= x) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(1);
		list.add(2);
		list.add(8);
		list.add(4);
		list.add(5);

		int x = 9;

		int count = countOfElements(x, list);
		System.out.println(count);

	}

}
