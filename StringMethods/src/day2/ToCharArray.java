package day2;

import java.util.Scanner;

public class ToCharArray {

	static char[] toCharArray(String str) {
		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		return arr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		char[] arr = toCharArray(str);
		System.out.println(arr);
	}

}
