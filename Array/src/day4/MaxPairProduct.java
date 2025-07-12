package day4;

import java.util.Scanner;

public class MaxPairProduct {

	static int maxPairProduct(int[] arr) {
		int firstLargest = arr[0], secondLargest = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}

		return firstLargest * secondLargest;
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

		int result = maxPairProduct(arr);
		System.out.println("Max Pair Product =" + result);
	}
}
