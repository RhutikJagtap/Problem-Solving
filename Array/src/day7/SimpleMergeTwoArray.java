package day7;

import java.util.Scanner;

//given two sorted array merge these arrays
public class SimpleMergeTwoArray {

	static int[] mergeArray(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length) {
			res[k] = arr1[i];
			k++;
			i++;
		}

		while (j < arr2.length) {
			res[k] = arr2[j];
			k++;
			j++;
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of first array");
		int size1 = scanner.nextInt();

		int[] arr1 = new int[size1];

		System.out.println("Enter the first array elements ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}

		System.out.println("Enter the size of second array");
		int size2 = scanner.nextInt();

		int[] arr2 = new int[size2];

		System.out.println("Enter the second array elements ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scanner.nextInt();
		}

		System.out.println("Resultant array Elements ");
		int[] res = mergeArray(arr1, arr2);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
