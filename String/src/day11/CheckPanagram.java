package day11;

import java.util.Scanner;

/*
i/p rjacademy
o/p false

i/p A quick brown fox jumps over the lazy dog
o/p true


*/
public class CheckPanagram {

	static boolean isPanagram(String s) {
		String t = "abcdefghijklmnopqrstuvwxyz";
		s = s.toLowerCase();

		int count = 0;
		for (int i = 0; i < t.length(); i++) {
			if (s.indexOf(t.charAt(i)) >= 0) {
				count++;
			} else {
				break;
			}
		}

		if (count == 26) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = scanner.nextLine();

		boolean result = isPanagram(s);
		System.out.println(result);
	}

}
