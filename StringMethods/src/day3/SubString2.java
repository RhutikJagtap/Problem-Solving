package day3;

import java.util.Scanner;

/*
i/p
rjacademy
2
5

o/p
acad
*/

public class SubString2 {

	static String substring(String s, int startIndex, int endIndex) {
		String temp = "";

		for (int i = startIndex; i <= endIndex; i++) {
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

		System.out.println("Enter the end index");
		int endIndex = scanner.nextInt();

		String result = substring(s, startIndex, endIndex);
		System.out.println(result);
	}

}
