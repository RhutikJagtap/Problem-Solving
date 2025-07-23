package day6;

import java.util.Scanner;

public class PrintSubStringOfSize {

	static void printSubStrings(String str, int size) {
		for (int i = 0; i <= str.length() - size; i++) {
			String t = "";
			for (int j = i; j < size + i; j++) {
				t = t + str.charAt(j);
			}
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = scanner.nextLine();

		System.out.println("Enter the size of substring");
		int size = scanner.nextInt();

		printSubStrings(str, size);
	}

}
