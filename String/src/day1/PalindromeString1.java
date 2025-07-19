package day1;

import java.util.Scanner;

public class PalindromeString1 {

	static String reverse(String s) {
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		return t;
	}

	static boolean isPalindrome(String s) {
		String reverseString = reverse(s);

		return s.equals(reverseString) ? true : false;

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
