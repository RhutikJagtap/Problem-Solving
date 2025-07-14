package day6;

import java.util.Scanner;

public class PrintLargestRepeatingElement {

	static int largestRepeating(int[] arr) {
		for (int i = arr.length - 1; i >= 1; i--) {
			if (arr[i] == arr[i - 1]) {
				return arr[i];
			}
		}

		return -1;
	}

	// different style loops
	static int largestRepeating2(int[] arr) {
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] == arr[i + 1]) {
				return arr[i];
			}
		}

		return -1;
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

		int result = largestRepeating(arr);
		System.out.println("Largest Repeating element= " + result);

	}

}
