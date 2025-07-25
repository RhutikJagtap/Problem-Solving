package day1;

import java.util.Scanner;

public class ToUpperCase {

	static String toUpperCase(String s) {
		String t = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
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
		String s = scanner.nextLine();

		System.out.println("Uppercase String");
		String result = toUpperCase(s);
		System.out.println(result);
	}

}
