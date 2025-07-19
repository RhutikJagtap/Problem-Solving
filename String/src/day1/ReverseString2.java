package day1;

import java.util.Scanner;

public class ReverseString2 {

	static String reverse(String s) {
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			t = t + ch;
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string ");
		String s = scanner.nextLine();

		System.out.println("Reverse String ");
		String result = reverse(s);
		System.out.println(result);
	}

}
