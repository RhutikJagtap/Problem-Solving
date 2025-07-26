package day2;

import java.util.Scanner;

public class StartsWith {

	static boolean startsWith(String str, String key) {
		// if search string length is greater than original string
		if (key.length() > str.length()) {
			return false;
		}

		for (int i = 0; i < key.length(); i++) {
			if (key.charAt(i) != str.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		System.out.println("Enter the string to check starts with");
		String key = scanner.nextLine();

		boolean result = startsWith(str, key);
		System.out.println(result);

	}

}
