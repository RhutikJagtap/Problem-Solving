package day6;

import java.util.Scanner;

public class PrintElementsWithoutRepeating {

	static void printElements(int[] arr) {

		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i + 1]) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println(arr[arr.length-1]);
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

		System.out.println("Elements without repeating");
		printElements(arr);

	}

}
