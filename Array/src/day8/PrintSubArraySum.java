package day8;

import java.util.Scanner;

//print all the subarrays of given size whose sum is equal to
public class PrintSubArraySum {

	static void printSubArraySum(int[] arr, int size, int sum) {
		for (int i = 0; i <= arr.length - size; i++) {
			int subArraySum = 0;
			for (int j = i; j < size + i; j++) {
				subArraySum = subArraySum + arr[j];
			}
			if (subArraySum == sum) {
				for (int j = i; j < size + i; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
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

		System.out.println("Enter the size of subarray");
		int size = scanner.nextInt();

		System.out.println("Enter the sum of subarray");
		int sum = scanner.nextInt();

		System.out.println("Sub Arrays ");
		printSubArraySum(arr, size, sum);
	}

}
