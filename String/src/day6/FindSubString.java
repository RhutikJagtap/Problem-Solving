package day6;

import java.util.Scanner;

public class FindSubString {

	static String findSubString(String s, String k) {
		int size = k.length();
		for (int i = 0; i < s.length() - size; i++) {
			String t = "";
			for (int j = i; j < size + i; j++) {
				t = t + s.charAt(j);
			}
			if (t.equals(k)) {
				return "yes";
			}
		}
		return "no";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first string");
		String s = scanner.nextLine();

		System.out.println("Enter the second string which you want to find");
		String k = scanner.nextLine();

		String result = findSubString(s, k);
		System.out.println(result);
	}

}
