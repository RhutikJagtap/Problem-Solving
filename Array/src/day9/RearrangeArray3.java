package day9;

import java.util.Scanner;

//write a program to put all the 0 to the end of the array.
public class RearrangeArray3 {

	static void rearrange(int[] arr) {
		// i used to fetch the element
		int i = 0;
		// j used to update element
		int j = 0;

		while (i < arr.length) {
			if (arr[i] == 0) {
				i++;
			} else {
				arr[j] = arr[i];
				i++;
				j++;
			}
		}

		while (j < arr.length) {
			arr[j] = 0;
			j++;
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
