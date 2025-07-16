package day8;

import java.util.Scanner;

//print all the subarrays of all sizes
public class PrintAllSubArraySum {

	static void subArraySumOfSize(int[] arr, int size) {
		for (int i = 0; i <= arr.length - size; i++) {
			int sum=0;
			for (int j = i; j < size + i; j++) {
				sum=sum+arr[j];
			}
			System.out.println(sum);
		}
	}

	static void printAllSubArraySum(int[] arr) {
		for (int size = 1; size <= arr.length; size++) {
			subArraySumOfSize(arr, size);
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

		System.out.println("All  SubArrays Sum");
		printAllSubArraySum(arr);
	}

}
