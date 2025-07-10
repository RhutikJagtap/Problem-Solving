package day2;

import java.util.Scanner;

public class SumOfNMinus1Elements {
	static int sum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	
	static void sumOfNMinusOne(int[] arr) {
		int sum = sum(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(sum-arr[i]);
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

		sumOfNMinusOne(arr);
	}
}
