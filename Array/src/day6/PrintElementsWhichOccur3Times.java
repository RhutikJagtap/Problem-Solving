package day6;

import java.util.Scanner;

public class PrintElementsWhichOccur3Times {
	static void printElements(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				if (count == 3) {
					System.out.print(arr[i] + " ");
				}
				count = 1;
			}
		}

		if (count == 3) {
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

		System.out.println("3 times occur Elements");
		printElements(arr);
	}

}
