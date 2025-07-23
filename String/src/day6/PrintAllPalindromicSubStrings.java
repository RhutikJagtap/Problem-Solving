package day6;

import java.util.Scanner;

public class PrintAllPalindromicSubStrings {

	static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	static void printPalindromicSubStrings(String str, int size) {
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

	static void printAllPalindromicSubStrings(String str) {
		for (int size = 1; size <= str.length(); size++) {
			printPalindromicSubStrings(str, size);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		System.out.println("All palindromic substrings");
		printAllPalindromicSubStrings(str);
	}

}
