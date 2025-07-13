package day5;

import java.util.Scanner;

public class PrintPairsWhoseProduct {

	static void printPairs(int[] arr, int product) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] * arr[j] == product) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}

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

		System.out.println("Enter the product value");
		int product = scanner.nextInt();

		System.out.println("Possible Pairs");
		printPairs(arr, product);
	}

}
