package day3;

import java.util.Scanner;

public class RearrangeString2 {

	static String rearrange(String s) {
		String t1 = "";
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				t1 = t1 + ch;
			} else if (ch >= '0' && ch <= '9') {
				sum = sum + ch - 48;
			}
		}

		return t1 + sum;
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
