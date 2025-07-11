package day3;

import java.util.Scanner;

public class MaxMinSumFromNMinus1 {

	static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	static int max(int[] arr) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static int min(int[] arr) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	static void maxMinSumFromNMinus1(int[] arr) {
		int sum = sum(arr);
		int min = min(arr);
		int max = max(arr);

		System.out.println("Max Sum = " + (sum - min));
		System.out.println("Min Sum = " + (sum - max));
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

		maxMinSumFromNMinus1(arr);
	}

}
