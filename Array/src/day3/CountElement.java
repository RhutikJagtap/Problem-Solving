package day3;

import java.util.Scanner;

public class CountElement {
	static int countElement(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				count++;
			}
		}
		return count;
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

		System.out.println("Enter the element which you want to count occurence");
		int k = scanner.nextInt();

		int result = countElement(arr, k);
		System.out.println("Element count = " + result);
	}

}
