package day6;

import java.util.Scanner;

public class CountSubString {

	static int findSubString(String s, String k) {
		int count=0;
		int size = k.length();
		for (int i = 0; i < s.length() - size; i++) {
			String t = "";
			for (int j = i; j < size + i; j++) {
				t = t + s.charAt(j);
			}
			if (t.equals(k)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first string");
		String s = scanner.nextLine();

		System.out.println("Enter the second string which you want to find");
		String k = scanner.nextLine();

		int result = findSubString(s, k);
		System.out.println(result);
	}

}
