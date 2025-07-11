package day3;

import java.util.Scanner;

public class ProductOfNMinus1 {
	static long product(int[] arr) {
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			product = product * arr[i];
		}
		return product;
	}

	static long[] productOfNMinus1(int[] arr) {
		long[] res = new long[arr.length];
		long product = product(arr);

		for (int i = 0; i < arr.length; i++) {
			res[i] = product / arr[i];
		}
		return res;
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

		System.out.println("Product of n-1 elements ");
		long[] res = productOfNMinus1(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

}
