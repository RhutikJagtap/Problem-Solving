package day9;

import java.util.Scanner;

public class RearrangeArray1 {

	static int[] rearrange(int[] arr) {
		int[] res = new int[arr.length];
		int k = 0;

		for (int i = 0; i < res.length; i++) {
			if (arr[i] == -1) {
				res[k] = arr[i];
				k++;
			}
		}

		for (int i = 0; i < res.length; i++) {
			if (arr[i] != -1) {
				res[k] = arr[i];
				k++;
			}
		}

		return res;
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
		int[] res = rearrange(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
