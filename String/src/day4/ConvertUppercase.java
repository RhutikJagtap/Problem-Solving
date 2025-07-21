package day4;

import java.util.Scanner;

public class ConvertUppercase {
	static String toUpperCase(String str) {
		String t = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				t = t + (char) (ch - 32);
			} else {
				t = t + ch;
			}

		}
		return t;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		String result = toUpperCase(str);
		System.out.println(result);
	}

}
