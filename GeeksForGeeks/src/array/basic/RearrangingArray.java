package array.basic;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an array arr of distinct integers. Rearrange the array in such a way that the first element is the smallest and the second element is the largest, 
the third element is the second smallest and the fourth element is the second largest, and so on.

Examples:

Input: arr[] = [4, 5, 1, 2, 3]
Output: [1, 5, 2, 4, 3]
		
Input: arr[] = [1, 2, 3, 4]
Output: [1, 4, 2, 3]
*/
public class RearrangingArray {
	public static ArrayList<Integer> rearrange(int[] arr) {
		Arrays.sort(arr);

		ArrayList<Integer> al = new ArrayList<Integer>();

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			al.add(arr[i]);
			i++;
			al.add(arr[j]);
			j--;
		}

		if (arr.length % 2 != 0) {
			al.add(arr[i]);
		}

		return al;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 1, 2, 3 };

		ArrayList<Integer> al = rearrange(arr);
		System.out.println(al);
	}
}
