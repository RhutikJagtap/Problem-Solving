package day10;

import java.util.Scanner;

public class ConsecutiveSubArray4 {

	static void printLongestConsecutiveSubArray(int[] arr) {
		int longestLength = Integer.MIN_VALUE;

		int length = 1;

		int si = 0;
		int ei = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] == 1) {
				length++;
			} else {
				if (length > longestLength) {
					longestLength = length;
					ei = i;
				}
				length = 1;
			}

		}
		if (length > longestLength) {
			longestLength = length;
			ei = arr.length - 1;
		}

		si = ei - longestLength + 1;

		for (int i = si; i <= ei; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Longest consecutive Subarray");
		printLongestConsecutiveSubArray(arr);
	}
}
