package day8;

import java.util.Scanner;

public class CountVowels {

	static int countVowels(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		int count = countVowels(str);
		System.out.println(count);
	}

}
