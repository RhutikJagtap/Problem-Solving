package day3;

import java.util.Scanner;

/*
i/p
rjacademy
2

o/p
academy
*/

public class SubString1 {

	static String substring(String s, int startIndex) {
		String temp = "";

		for (int i = startIndex; i < s.length(); i++) {
			temp = temp + s.charAt(i);
		}

		return temp;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = scanner.nextLine();

		System.out.println("Enter the start index");
		int startIndex = scanner.nextInt();

		String result = substring(s, startIndex);
		System.out.println(result);
	}

}
