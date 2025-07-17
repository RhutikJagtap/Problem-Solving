package day9;

import java.util.Scanner;

public class RearrangeArray2 {

	static void rearrange(int[] arr) {
		// i used to fetch the element
		int i = arr.length - 1;
		// j used to update element
		int j = arr.length - 1;

		while (i >= 0) {
			if (arr[i] == -1) {
				i--;
			} else {
				arr[j] = arr[i];
				i--;
				j--;
			}
		}

		while (j >= 0) {
			arr[j] = -1;
			j--;
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

		System.out.println("After rearranging the array");
		rearrange(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
