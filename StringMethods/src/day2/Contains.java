package day2;

import java.util.Scanner;

public class Contains {

	static boolean contains(String str, String key) {
		int i = 0;
		int count = 0;

		// two pointer approach
		while (i < str.length() && count < key.length()) {

			if (key.charAt(count) == str.charAt(i)) {
				i++;
				count++;
			} else {
				i++;
				count = 0;
			}

		}

		if (key.length() == count) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string ");
		String str = scanner.nextLine();

		System.out.println("Enter the string to search  ");
		String key = scanner.nextLine();

		boolean result = contains(str, key);
		System.out.println(result);
	}

}
