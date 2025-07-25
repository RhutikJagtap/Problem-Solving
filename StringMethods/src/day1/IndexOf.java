package day1;

import java.util.Scanner;

public class IndexOf {

	static int indexOf(String s, char ch) {
		for (int i = 0; i < s.length(); i++) {
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

		System.out.println("Enter the charcter");
		char ch = scanner.next().charAt(0);

		System.out.println("Character found at index");
		int index = indexOf(s, ch);
		System.out.println(index);
	}

}
