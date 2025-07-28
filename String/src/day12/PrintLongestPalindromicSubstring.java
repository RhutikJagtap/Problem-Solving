package day12;

import java.util.Scanner;

public class PrintLongestPalindromicSubstring {
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

	static String printLongestPalindromicSubstring(String str) {
		String res = "";
		for (int size = 1; size <= str.length(); size++) {

			for (int i = 0; i <= str.length() - size; i++) {
				String t = "";
				for (int j = i; j < size + i; j++) {
					t = t + str.charAt(j);
				}
				if (isPalindrome(t)) {
					// if two palindromic substring of same size then we will get first
					// if i want second make changes t.length() >= res.length()
					if (t.length() > res.length()) {
						res = t;
					}
				}
			}
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		System.out.println("Longest palindromic substring");
		String result = printLongestPalindromicSubstring(str);
		System.out.println(result);
	}
}
