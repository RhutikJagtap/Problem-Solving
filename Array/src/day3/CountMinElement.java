package day3;

import java.util.Scanner;

public class CountMinElement {
	static int min(int[] arr) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	static int countMinElement(int[] arr) {
		int min = min(arr);

		int minCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				minCount++;
			}
		}
		return minCount;
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

		int result = countMinElement(arr);
		System.out.println("Min Element count = " + result);
	}
}
