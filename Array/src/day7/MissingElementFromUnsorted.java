package day7;

import java.util.Scanner;

public class MissingElementFromUnsorted {

	static int findMissing(int[] arr) {
		int n = arr.length + 1;

		int sum1 = n * (n + 1) / 2;

		int sum2 = 0;

		for (int i = 0; i < arr.length; i++) {
			sum2 = sum2 + arr[i];
		}

		return sum1 - sum2;
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

		int result = findMissing(arr);
		System.out.println("Missing Element =" + result);
	}

}
