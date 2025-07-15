package day7;

import java.util.Scanner;

//print the common elements from two array (both  array sorted in descending output also descending)  
public class CommonElementsFromTwoArray4 {
	static void commonElements(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				j++;
			} else {
				i++;
			}
		}

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

		System.out.println("Common Elements ");
		commonElements(arr1, arr2);

	}

}
