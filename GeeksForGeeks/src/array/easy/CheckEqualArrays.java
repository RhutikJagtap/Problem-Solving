package array.easy;

import java.util.Arrays;

/*Given two arrays a[] and b[] of equal size, the task is to find whether the elements in the arrays are equal.
Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal.

Examples:

Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]
Input: a[] = [1, 2, 5], b[] = [2, 4, 15]
Output: false
Explanation: a[] and b[] have only one common value.
*/
public class CheckEqualArrays {

	public static boolean checkEqual(int[] a, int[] b) {
		if (a.length!=b.length) {
			return false;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (int i = 0; i < b.length; i++) {
			if (a[i]!=b[i]) {
				return false;
			}
		}
	
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr1= {1, 2, 5, 4, 0};
		
		int[] arr2= {2, 4, 5, 0, 1};
		
		boolean result = checkEqual(arr1, arr2);
		System.out.println(result);
	}

}
