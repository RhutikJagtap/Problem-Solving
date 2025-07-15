package day7;

import java.util.Scanner;

//3.find Missing element using Arithmetic Progression formula
public class MissingElementUsingAPFormula {

	static int[] findMinMax(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return new int[] { min, max };
	}

	static int findMissing(int[] arr) {
		int[] res = findMinMax(arr);

		int firstTerm = res[0];
		int lastTerm = res[1];

		int total_terms = lastTerm - firstTerm + 1;

		// Arithmetic progression formula
		int ap = (total_terms * (firstTerm + lastTerm)) / 2;

		int arraySum = 0;

		for (int i = 0; i < arr.length; i++) {
			arraySum = arraySum + arr[i];
		}

		return ap - arraySum;
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

		int result = findMissing(arr);
		System.out.println("Missing Element = " + result);
	}

}
