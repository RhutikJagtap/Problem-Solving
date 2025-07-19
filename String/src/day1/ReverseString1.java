package day1;

import java.util.Scanner;

public class ReverseString1 {

	static String reverse(String s) {
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			t = ch + t;
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
