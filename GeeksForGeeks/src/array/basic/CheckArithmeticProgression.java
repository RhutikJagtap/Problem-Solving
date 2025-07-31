package array.basic;

import java.util.Arrays;

/*Given an array arr[] of integers. 
Write a program to check whether an arithmetic progression can be formed using all the given elements. 

Examples:

Input: arr[] = [0, 12, 4, 8]
Output: true
Explanation: Rearrange given array as [0, 4, 8, 12] which forms an arithmetic progression.

Input: arr[] = [12, 40, 11, 20]
Output: false
Explanation: there is no rearrangment which can forms an arithmetic progression.
*/
public class CheckArithmeticProgression {

	public static boolean checkIsAP(int[] arr) {

		Arrays.sort(arr);

		int diff = arr[0] - arr[1];

		for (int i = 2; i < arr.length-1; i++) {
			if (arr[i] - arr[i + 1] != diff) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] arr= {0, 12, 4, 9};
		
		boolean result = checkIsAP(arr);
		System.out.println(result);
	}

}
