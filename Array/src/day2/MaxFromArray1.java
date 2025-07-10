package day2;

import java.util.Scanner;

public class MaxFromArray1 {

	static int max(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of array ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		int result = max(arr);
		System.out.println(result);
	}

}
