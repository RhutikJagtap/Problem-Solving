package day7;

import java.util.Scanner;

public class MissingElementInParticularRange {
	static int[] findMinAndMax(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return new int[] { min, max };
	}

	static int findMissing(int[] arr) {
		int[] res = findMinAndMax(arr);

		int min = res[0];
		int max = res[1];

		int n1 = min - 1;
		int n2 = max;

		int sumBeforeMin = n1 * (n1 + 1) / 2;
		int sumOfMax = n2 * (n2 + 1) / 2;

		// Expected sum of all numbers from min to max (inclusive)
		int expectedSum = sumOfMax - sumBeforeMin;

		// Actual sum of array elements
		int actualSum = 0;
		for (int i = 0; i < arr.length; i++) {
			actualSum = actualSum + arr[i];
		}

		// The difference is the missing number
		return expectedSum - actualSum;
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

		int result = findMissing(arr);
		System.out.println("Missing Element = " + result);
	}

}
