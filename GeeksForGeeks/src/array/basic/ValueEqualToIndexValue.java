package array.basic;

import java.util.ArrayList;
import java.util.List;

/*Given an array arr. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Note: There can be more than one element in the array which have the same value as its index.
 You need to include every such element's index. Follows 1-based indexing of the array.

Examples:

Input: arr[] = [15, 2, 45, 4 , 7]
Output: [2, 4]
Explanation: Here, arr[2] = 2 exists here and arr[4] = 4 exists here.
Input: arr[] = [1]
Output: [1]
Explanation: Here arr[1] = 1 exists.*/
public class ValueEqualToIndexValue {
	public static List<Integer> valueEqualToIndex(List<Integer> nums) {
		List<Integer> list = new ArrayList();
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i).equals(i + 1)) {
				list.add(nums.get(i));
			}
		}

		return list;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(2);
		list.add(45);
		list.add(4);
		list.add(7);

		System.out.println(valueEqualToIndex(list));
	}

}
