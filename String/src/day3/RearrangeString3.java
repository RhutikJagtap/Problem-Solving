package day3;

import java.util.Scanner;

public class RearrangeString3 {

	static String convert(String s) {
		String t = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				if (ch >= 'A' && ch <= 'Z') {
					t = t + (char) (ch + 32);
				} else {
					t = t + (char) (ch - 32);
				}
			}
		}

		return t;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = scanner.nextLine();

		System.out.println("Resultant String");
		String result = convert(s);
		System.out.println(result);
	}

}
