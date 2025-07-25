package day1;

import java.util.Scanner;

public class Trim {
	static String trim(String str) {
		int startIndex = 0;
		int endIndex = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				startIndex = i;
				break;
			}
		}

		for (int j = str.length() - 1; j >= 0; j--) {
			if (str.charAt(j) != ' ') {
				endIndex = j;
				break;
			}
		}

		String t = "";
		for (int k = startIndex; k <= endIndex; k++) {
			t = t + str.charAt(k);
		}

		return t;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		String result = trim(str);
		System.out.println(result);
	}

}
