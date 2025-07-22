package day5;

import java.util.Scanner;

public class Rearrange4 {

	static String rearrangeString(String str) {
		String t = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				t = t + (char) (ch - 32);
			}
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				t = t + (char) (ch + 32);
			} else {
				t = t + ch;
			}

		}

		return t;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String ");
		String str = scanner.nextLine();

		String result = rearrangeString(str);
		System.out.println(result);
	}
}
