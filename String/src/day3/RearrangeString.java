package day3;

import java.util.Scanner;

public class RearrangeString {

	static String rearrange(String s) {
		String t1 = "";
		String t2 = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				if (ch >= 'A' && ch <= 'Z') {
					t1 = t1 + ch;
				} else {
					t2 = t2 + ch;
				}
			}
		}

		return t1 + t2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = scanner.nextLine();

		System.out.println("After rearranging String");
		String result = rearrange(s);
		System.out.println(result);
	}

}
