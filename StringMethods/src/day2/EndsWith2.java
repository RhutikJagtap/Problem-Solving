package day2;

import java.util.Scanner;

public class EndsWith2 {

	static boolean endsWith(String str, String key) {
		int si = str.length() - key.length();

		int j = 0;
		for (int i = si; i < str.length(); i++) {
			if (str.charAt(i) != key.charAt(j)) {
				return false;
			}
			j++;
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
