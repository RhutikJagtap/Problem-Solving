package day6;

import java.util.Scanner;

public class PrintSmallestRepeatingElement {

	static int smallestRepeating(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[i + 1]) {
				return arr[i];
			}
		}

		return -1;
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

		int result = smallestRepeating(arr);
		System.out.println("Smallest Repeating element= " + result);

	}

}
