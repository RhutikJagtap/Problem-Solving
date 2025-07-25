package day1;

import java.util.Scanner;

public class LastIndexOf {

	static int lastIndexOf(String s, char ch) {
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ch) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String");
		String s = scanner.nextLine();

		System.out.println("Enter the character");
		char ch = scanner.next().charAt(0);

		System.out.println("last index of character");
		int index = lastIndexOf(s, ch);
		System.out.println(index);
	}

}
