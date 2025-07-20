package day3;

import java.util.Scanner;

public class VowelsConsonantCount {
	static void countVowelConsonant(String s) {
		int vc = 0, cc = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' || ch <= 'z')) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					vc++;
				} else {
					cc++;
				}
			}
		}
		System.out.println("vowel count = " + vc);
		System.out.println("consonant count = " + cc);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = scanner.nextLine();

		countVowelConsonant(s);
	}

}
