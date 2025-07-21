package day4;

import java.util.Scanner;

public class RemoveExtraSpaces {
	static String removeExtraSpaces(String s) {

		int si = 0;
		int ei = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				si = i;
				break;
			}
		}

		for (int j = s.length() - 1; j >= 0; j--) {
			if (s.charAt(j) != ' ') {
				ei = j;
				break;
			}
		}

		String t = "";
		for (int k = si; k <= ei; k++) {
			if (s.charAt(k) != ' ' || s.charAt(k) == ' ' && s.charAt(k + 1) != ' ') {
				t = t + s.charAt(k);
			}
		}
		
		return t;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = scanner.nextLine();

		System.out.println("After removing extra spaces");
		String result = removeExtraSpaces(s);
		System.out.println(result);
	}
}
