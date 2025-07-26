package day10;

import java.util.Scanner;

//longest substring without repeating characters
public class LongestNonRepeatingSubString {

	static String nonRepeatingSubstring(String s) {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			String temp = "";
			for (int j = i; j < s.length(); j++) {
				// check character is not present in temp
				if (temp.indexOf(s.charAt(j)) == -1) {
					temp = temp + s.charAt(j);
				} else {
					// if character is present means we find non repeating substring
					break;
				}
			}

			if (temp.length() > result.length()) {
				result = temp;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = scanner.nextLine();

		System.out.println("Longest non repeating substring");
		String result = nonRepeatingSubstring(s);
		System.out.println(result);
	}

}
