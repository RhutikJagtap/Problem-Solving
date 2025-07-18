package day10;

import java.util.Scanner;

public class ConsecutiveSubArray3 {

	static void printLengthOfConsecutive(int[] arr) {

		int length = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] == 1) {
				length++;
			} else {
				System.out.print(length);
				length = 1;
				System.out.println();
			}

		}
		System.out.print(length);
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

		System.out.println("Length of Consecutive SubArrays");
		printLengthOfConsecutive(arr);
	}
}
