package day7;

import java.util.Scanner;

public class SplitString {

	static int countWords(String s) {
		int count = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return s.charAt(0) == ' ' ? count : count + 1;
	}

	static String[] split(String str) {
		int count = countWords(str);

		String[] arr = new String[count];

		int j = 0;
		String t = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				t = t + str.charAt(i);
			} else if (t.length() > 0) {
				arr[j] = t;
				j++;
				t = "";
			}
		}

		arr[j] = t;
		return arr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		String[] result = split(str);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
