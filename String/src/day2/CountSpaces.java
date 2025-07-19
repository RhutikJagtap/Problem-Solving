package day2;

import java.util.Scanner;

public class CountSpaces {
	static int countSpaces(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string ");
		String s = scanner.nextLine();

		System.out.println("Total number of spaces");
		int count = countSpaces(s);
		System.out.println(count);
	}

}
