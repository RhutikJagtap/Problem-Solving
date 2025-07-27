package day11;

import java.util.Arrays;
import java.util.Scanner;

/*
funreal
academy
o/p false

funreal
real fun
o/p  true
*/

public class CheckAnagram {

	static boolean isAnagram(String s1, String s2) {
		String temp = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				temp = temp + s1.charAt(i);
			}
		}
		s1 = temp;

		temp = "";
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) != ' ') {
				temp = temp + s2.charAt(i);
			}
		}

		s2 = temp;

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		s1 = new String(arr1);
		s2 = new String(arr2);

//		System.out.println(s1);
//		System.out.println(s2);

		return s1.equals(s2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first string");
		String s1 = scanner.nextLine();

		System.out.println("Enter the second string");
		String s2 = scanner.nextLine();

		boolean result = isAnagram(s1, s2);
		System.out.println(result);
	}

}
