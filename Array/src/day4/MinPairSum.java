package day4;

import java.util.Scanner;

public class MinPairSum {

	static int secondSmallest(int[] arr) {
		int firstSmallest = arr[0], secondSmallest = Integer.MAX_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = arr[i];
			} else if (arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}

		return firstSmallest + secondSmallest;
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

		int result = secondSmallest(arr);
		System.out.println("Min Pair Sum =  " + result);
	}

}
