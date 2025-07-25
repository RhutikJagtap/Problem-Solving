package day8;

import java.util.Scanner;

public class ReverseString {
	static String reverse(String str) {
		String t = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			t = t + str.charAt(i);
		}

		return t;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		String result = reverse(str);
		System.out.println(result);

	}

}
