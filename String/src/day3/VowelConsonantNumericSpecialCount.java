package day3;

import java.util.Scanner;

public class VowelConsonantNumericSpecialCount {
	static void count(String s) {
		int vc = 0, cc = 0, nc = 0, sc = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					vc++;
				} else {
					cc++;
				}
			} else if (ch >= '0' && ch <= '9') {
				nc++;
			} else {
				sc++;
			}
		}

		System.out.println("Vowel count =" + vc);
		System.out.println("Consonant count =" + cc);
		System.out.println("Numeric count =" + nc);
		System.out.println("Special character count =" + sc);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = scanner.nextLine();

		count(s);

	}

}
