package day5;

import java.util.Scanner;

public class PrintPairsWhoseSum {

	static void printPairs(int[] arr, int sum) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
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

		System.out.println("Enter the elements of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Enter the sum ");
		int sum = scanner.nextInt();

		System.out.println("All possible pairs");
		printPairs(arr, sum);
	}

}
