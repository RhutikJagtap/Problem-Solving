package day3;

import java.util.Scanner;

//optimize
public class CountMinElement2 {

	static int countMaxElement(int[] arr) {
		int min = Integer.MAX_VALUE;

		int minCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minCount = 1;
			} else if (arr[i] == min) {
				minCount++;
			}
		}
		return minCount;
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

		int result = countMaxElement(arr);
		System.out.println("Min Element count = " + result);
	}
}
