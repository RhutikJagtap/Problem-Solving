package day6;

import java.util.Scanner;

public class CompareTwoStrings {
	static boolean equals(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first string");
		String s1 = scanner.nextLine();

		System.out.println("Enter the second string");
		String s2 = scanner.nextLine();

		boolean result = equals(s1, s2);
		System.out.println(result);

	}

}
