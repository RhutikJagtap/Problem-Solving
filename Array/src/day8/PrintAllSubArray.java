package day8;

import java.util.Scanner;

//print all the subarrays of all sizes
public class PrintAllSubArray {

	static void printSubArrayOfSize(int[] arr, int size) {
		for (int i = 0; i <= arr.length - size; i++) {
			for (int j = i; j < size + i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}

	static void printAllSubArray(int[] arr) {
		for (int size = 1; size <= arr.length; size++) {
			printSubArrayOfSize(arr, size);
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

		System.out.println("All Size SubArrays");
		printAllSubArray(arr);
	}

}
