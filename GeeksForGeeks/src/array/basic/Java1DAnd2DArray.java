package array.basic;

import java.util.ArrayList;

/*Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array. Task is to find the sum of the left diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.

Example 1:

â€‹Input : arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}} 
        and N = 3
brr[] = {3, 6, 9}
Output : 15 9
Explanation:
1 2 3
4 5 6
7 8 9
So, this sum of left diagonal (1+ 5 + 9) = 15
The maximum element in an array brr is 9
So, will return {15, 9} as an answer.

â€‹Example 2:

Input : arr[][] = {{1,2}, {1, 2}} and N = 2
brr[] = {10, 1} 
Output :  3 10 */
public class Java1DAnd2DArray {

	public static ArrayList<Integer> array(int a[][], int b[], int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		int max = Integer.MIN_VALUE;

		int leftDiagonalSum = 0;
		for (int i = 0; i < n; i++) {
			leftDiagonalSum = leftDiagonalSum + a[i][i];
			if (b[i] > max) {
				max = b[i];
			}
		}
		al.add(leftDiagonalSum);
		al.add(max);

		return al;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[] brr = { 3, 6, 9 };

		int n = 3;

		ArrayList<Integer> al = array(a, brr, n);
		System.out.println(al);
	}

}
