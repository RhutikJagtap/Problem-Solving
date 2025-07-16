package day8;

import java.util.Scanner;

public class MergeThreeArray {
	static int[] mergeArray(int[] arr1, int[] arr2, int[] arr3) {
		int[] res = new int[arr1.length + arr2.length + arr3.length];

		int i = 0, k = 0;

		while (k < res.length) {
			if (i < arr1.length) {
				res[k] = arr1[i];
				k++;
			}

			if (i < arr2.length) {
				res[k] = arr2[i];
				k++;
			}

			if (i < arr3.length) {
				res[k] = arr3[i];
				k++;
			}
			i++;
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of first array");
		int size1 = scanner.nextInt();

		int[] arr1 = new int[size1];

		System.out.println("Enter the first array elements");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}

		System.out.println("Enter the size of second array");
		int size2 = scanner.nextInt();

		int[] arr2 = new int[size2];

		System.out.println("Enter the second array elements");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scanner.nextInt();
		}

		System.out.println("Enter the size of third array");
		int size3 = scanner.nextInt();

		int[] arr3 = new int[size3];

		System.out.println("Enter the third array elements");
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = scanner.nextInt();
		}

		int[] res = mergeArray(arr1, arr2, arr3);
		System.out.println("Resulatant Array ");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

}
