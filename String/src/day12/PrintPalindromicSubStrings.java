package day12;

import java.util.Scanner;

public class PrintPalindromicSubStrings {

	static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	static void printPalindromicSubstring(String str) {
		for (int size = 1; size <= str.length(); size++) {

			for (int i = 0; i <= str.length() - size; i++) {
				String t = "";
				for (int j = i; j < size + i; j++) {
					t = t + str.charAt(j);
				}
				if (isPalindrome(t)) {
					System.out.println(t);
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		printPalindromicSubstring(str);
	}

}
