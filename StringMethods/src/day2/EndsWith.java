package day2;

import java.util.Scanner;

public class EndsWith {

	static boolean endsWith(String str, String key) {
		if (key.length() > str.length()) {
			return false;
		}

		for (int i = key.length() - 1, j = str.length() - 1; i >= 0 && j >= 0; i--, j--) {
			if (key.charAt(i) != str.charAt(j)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.nextLine();

		System.out.println("Enter the string to check ends with");
		String key = scanner.nextLine();

		boolean result = endsWith(str, key);
		System.out.println(result);
	}

}
