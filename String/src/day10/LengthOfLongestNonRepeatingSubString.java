package day10;

import java.util.Scanner;

public class LengthOfLongestNonRepeatingSubString {

	static int nonRepeatingSubStringLength(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			String temp = "";
			for (int j = i; j < s.length(); j++) {
				if (temp.indexOf(s.charAt(j)) == -1) {
					temp = temp + s.charAt(j);
				} else {
					break;
				}
			}

			if (temp.length() > result.length()) {
				result = temp;
			}

		}
		return result.length();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = scanner.nextLine();

		System.out.println("length of longest non repeating substring");
		int result = nonRepeatingSubStringLength(s);
		System.out.println(result);
	}

}
