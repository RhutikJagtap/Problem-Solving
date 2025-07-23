package day6;

import java.util.Scanner;

public class PrintAllSubStrings {
	static void printSubStrings(String str, int size) {
		for (int i = 0; i <= str.length() - size; i++) {
			String t = "";
			for (int j = i; j < size + i; j++) {
				t = t + str.charAt(j);
			}
			System.out.println(t);
		}
	}

	static void printAllSubStrings(String str) {
		for (int size = 1; size <= str.length(); size++) {
			printSubStrings(str, size);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		System.out.println("All substrings");
		printAllSubStrings(str);
	}

}
