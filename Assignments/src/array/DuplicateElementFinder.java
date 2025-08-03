package array;

/*
Given an array of integers,
 Write a program to print all the duplicate elements present in the array by insertion order and 
 each duplicate element should be printed in new line.

Input Format
The first line consists of N, size of the array

Second line consists of N space separated integers which are the elements of the array

Output Format
Print all the duplicate elements present in the array on new line.

Sample Inputs & Outputs
Sample Input 1

7
1 2 3 2 4 3 5
Sample Output 1

2
3
Sample Input 2

10
4 5 9 11 9 4 8 15 8 6
Sample Output 2

4
9
8
*/
public class DuplicateElementFinder {

	static void duplicateElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 9, 11, 9, 4, 8, 15, 8, 6 };

		duplicateElement(arr);
	}

}
