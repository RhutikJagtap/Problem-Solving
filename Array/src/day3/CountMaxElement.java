package day3;

import java.util.Scanner;

public class CountMaxElement {
	static int max(int[] arr) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static int countMaxElement(int[] arr) {
		int max = max(arr);

		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				maxCount++;
			}
		}
		return maxCount;
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

		int result = countMaxElement(arr);
		System.out.println("Max Element count = " + result);
	}
}
