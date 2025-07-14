package day6;

import java.util.Scanner;

public class MissingElementSortedArray {

	static int missingElement(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] != 1) {
				return arr[i] + 1;
			}
		}

		return arr[arr.length - 1] + 1;
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

		int result = missingElement(arr);
		System.out.println("Missing Element= " + result);
	}

}
