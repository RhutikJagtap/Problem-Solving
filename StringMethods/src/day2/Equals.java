package day2;

import java.util.Scanner;

public class Equals {

	static boolean equals(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first string");
		String str1 = scanner.nextLine();

		System.out.println("Enter the second string");
		String str2 = scanner.nextLine();

		boolean result = equals(str1, str2);
		System.out.println(result);
	}

}
