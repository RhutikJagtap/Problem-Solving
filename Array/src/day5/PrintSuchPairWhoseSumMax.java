package day5;

import java.util.Scanner;

public class PrintSuchPairWhoseSumMax {

	static void printMaxPairSum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int first_value = 0, second_value = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int current_sum = arr[i] + arr[j];
				if (current_sum > max) {
					max = arr[i] + arr[j];
					first_value = arr[i];
					second_value = arr[j];
				}
			}
		}
		System.out.println(first_value + " " + second_value);
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

		System.out.println("Max Pair");
		printMaxPairSum(arr);
	}

}
