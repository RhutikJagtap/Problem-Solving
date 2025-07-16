package day8;

import java.util.Scanner;

public class SumOfSubArrayOfSize {

	static void subArraySum(int[] arr, int size) {

		for (int i = 0; i <= arr.length - size; i++) {
			int sum = 0;
			for (int j = i; j < size + i; j++) {
				sum = sum + arr[j];
			}
			System.out.println(sum);
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

		System.out.println("Enter the subarray size ");
		int size = scanner.nextInt();

		System.out.println(" sum of all subarrays of given size");
		subArraySum(arr, size);
	}

}
