package day6;

import java.util.Scanner;

public class PrintRepeatedElement {

	static void repeatedElements(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				if (count > 1) {
					System.out.print(arr[i] + " ");
				}
				count = 1;
			}
		}

		if (count > 1) {
			System.out.print(arr[arr.length - 1]);
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

		System.out.println("Repeated Elements ");
		repeatedElements(arr);
	}

}
