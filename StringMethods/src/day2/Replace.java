package day2;

import java.util.Scanner;

public class Replace {

	static String replace(String str, char old_ch, char new_ch) {
		String t = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == old_ch) {
				t = t + new_ch;
			} else {
				t = t + str.charAt(i);
			}
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		System.out.println("Enter the old char");
		char old_ch = scanner.next().charAt(0);

		System.out.println("Enter the new  char");
		char new_ch = scanner.next().charAt(0);

		String result = replace(str, old_ch, new_ch);
		System.out.println(result);

	}

}
