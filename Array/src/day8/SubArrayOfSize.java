package day8;

import java.util.Scanner;

public class SubArrayOfSize {

	static void printSubArray(int[] arr, int size) {

		for (int i = 0; i <= arr.length - size; i++) {
			for (int j = i; j < size + i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Enter the subarray size");
		int size = scanner.nextInt();

		printSubArray(arr, size);
	}

}
