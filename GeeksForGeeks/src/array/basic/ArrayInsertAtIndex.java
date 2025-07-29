package array.basic;

import java.util.ArrayList;

/*Array insert at index
Difficulty: BasicAccuracy: 44.81%Submissions: 113K+Points: 1
You are given an array arr(0-based index) and two positive integer index and val. You need to insert an val at given index.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], index = 5, val = 90
Output: 1 2 3 4 5 90
Explanation: 90 is inserted at index 5(0-based indexing). After inserting,array elements are like [1, 2, 3, 4, 5, 90].
Input: arr[] = [1, 2, 3, 4, 5], index = 2, val = 90
Output: [1, 2, 90, 3, 4, 5]
Explanation: 90 is inserted at index 2(0-based indexing). After inserting, array elements are like [1, 2, 90, 3, 4, 5].
*/
public class ArrayInsertAtIndex {

	public static void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
		arr.add(index, val);
	}

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		int index = 2;

		int val = 90;

		insertAtIndex(al, index, val);
		System.out.println(al);
	}

}
