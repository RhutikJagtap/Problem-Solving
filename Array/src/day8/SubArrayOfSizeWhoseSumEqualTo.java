package day8;

import java.util.Scanner;

//print count of sub arrays of given size whose sum is equal to given sum
public class SubArrayOfSizeWhoseSumEqualTo {

	static int printSubArrays(int[] arr, int size, int sum) {
		int count = 0;
		for (int i = 0; i <= arr.length - size; i++) {
			int subArraySum = 0;
			for (int j = i; j < size + i; j++) {
				subArraySum = subArraySum + arr[j];
			}
			if (subArraySum == sum) {
				count++;
			}
		}
		return count;
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

		int count = printSubArrays(arr, size, sum);
		System.out.println("Count = " + count);
	}

}
