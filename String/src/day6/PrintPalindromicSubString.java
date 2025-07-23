package day6;

import java.util.Scanner;

public class PrintPalindromicSubString {
	static void printPalindromicSubStrings(String str, int size) {
		for (int i = 0; i <= str.length()-size; i++) {
			String t = "";
			for (int j = i; j < size + i; j++) {
				t = t + str.charAt(j);
			}
			if (isPalindrome(t)) {
				System.out.println(t);
			}
		}

	}

	static boolean isPalindrome(String t) {
		int i = 0;
		int j = t.length() - 1;

		while (i < j) {
			if (t.charAt(i) != t.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		System.out.println("Enter the size of palindromic substring");
		int size = scanner.nextInt();

		printPalindromicSubStrings(str, size);
	}

}
