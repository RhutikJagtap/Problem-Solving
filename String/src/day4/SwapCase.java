package day4;

import java.util.Scanner;

public class SwapCase {

	static String swapCase(String s) {
		String t = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'A' && ch <= 'Z' || (ch >= 'a' && ch <= 'z')) {

				if (ch >= 'a' && ch <= 'z') {
					t = t + (char) (ch - 32);
				} else {
					t = t + (char) (ch + 32);
				}

			} else {
				t = t + ch;
			}
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = scanner.nextLine();

		String result = swapCase(s);
		System.out.println(result);
	}

}
