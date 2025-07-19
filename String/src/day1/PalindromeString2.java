package day1;

import java.util.Scanner;

public class PalindromeString2 {
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string ");
		String s = scanner.nextLine();

		boolean result = isPalindrome(s);

		if (result) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
