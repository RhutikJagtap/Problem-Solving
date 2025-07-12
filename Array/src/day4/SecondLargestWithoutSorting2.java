package day4;

import java.util.Scanner;

public class SecondLargestWithoutSorting2 {
	static int secondLargest(int[] arr) {
		int firstLargest = arr[0], secondLargest = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != firstLargest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
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

		int result = secondLargest(arr);
		System.out.println("Second Largest =" + result);
	}

}
