package day1;

import java.util.Scanner;

public class IndexOf2 {

	static int indexOf(String s, char ch, int occurence) {
		int occurenceCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				occurenceCount++;
			}
			if (occurenceCount == occurence) {
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

		System.out.println("Enter the occurence number");
		int occurence = scanner.nextInt();

		System.out.println("charcter  occurence found at index");
		int index = indexOf(s, ch, occurence);
		System.out.println(index);
	}

}
