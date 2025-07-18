package day10;

import java.util.Scanner;

public class ConsecutiveSubArray1 {

	static void printConsecutive(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] == 1) {
				System.out.print(arr[i]+" ");
			} else {
				System.out.print(arr[i]);
				System.out.println();
			}

		}
		System.out.println(arr[arr.length - 1]);
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

		System.out.println("Consecutive SubArray");
		printConsecutive(arr);
	}
}
