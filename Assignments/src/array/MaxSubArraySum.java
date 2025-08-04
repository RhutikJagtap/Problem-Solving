package array;

/*
Write a program that takes an integer n and an array of n integers as input and 
returns the contiguous subarray with the largest sum along with the sum.

Output Format
The output consists of the largest sum and the subarray that produces this sum.

Sample Inputs & Outputs
Sample Input 1
9
-2 1 -3 4 -1 2 1 -5 4

Sample Output 1
6
4 -1 2 1
----------------------
Sample Input 2
5
1 2 3 -2 5

Sample Output 2
9
1 2 3 -2 5
*/
public class MaxSubArraySum {

	static void largestSubArraySum(int[] arr) {

		int maxSubArraySum = 0;

		int si = 0;
		int ei = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int currentSum = 0;
				for (int k = i; k <= j; k++) {
					currentSum = currentSum + arr[k];
				}
				if (currentSum > maxSubArraySum) {
					maxSubArraySum = currentSum;
					si = i;
					ei = j;
				}
			}

		}

		System.out.println(maxSubArraySum);
		for (int j = si; j <= ei; j++) {
			System.out.print(arr[j] + " ");
		}

	}

	public static void main(String[] args) {

		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		largestSubArraySum(arr);

	}

}
